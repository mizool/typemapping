package com.github.mizool.typemapping.store.jdbc;

import java.sql.Types;
import java.util.Map;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.github.mizool.core.exception.UnprocessableEntityException;
import com.google.common.collect.ImmutableMap;

public class JdbcValueLoadStrategyResolver
{
    private final Map<Integer, JdbcValueLoadStrategy> strategies;

    @Inject
    protected JdbcValueLoadStrategyResolver(Instance<JdbcValueLoadStrategy> strategies)
    {
        ImmutableMap.Builder<Integer, JdbcValueLoadStrategy> builder  = ImmutableMap.builder();

        strategies.forEach(jdbcValueLoadStrategy -> jdbcValueLoadStrategy.getSourceColumnTypes()
            .forEach(sourceColumnType -> builder.put(sourceColumnType, jdbcValueLoadStrategy)));

        this.strategies = builder.build();
    }

    public JdbcValueLoadStrategy resolve(int columnType)
    {
        if (columnType == Types.JAVA_OBJECT) // This is what Presto will report on a static null, i.e. "select null".
        {
            throw new UnprocessableEntityException("Untyped NULL value not supported");
        }
        if (!strategies.containsKey(columnType))
        {
            throw new UnprocessableEntityException("No strategy for column type " + columnType);
        }
        return strategies.get(columnType);
    }
}