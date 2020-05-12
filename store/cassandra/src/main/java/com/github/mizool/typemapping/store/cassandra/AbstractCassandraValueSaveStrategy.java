package com.github.mizool.typemapping.store.cassandra;

import lombok.Getter;

import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.github.mizool.typemapping.business.DataType;

abstract class AbstractCassandraValueSaveStrategy implements CassandraValueSaveStrategy
{
    @Getter
    private final DataType sourceDataType;

    @Getter
    private final com.datastax.driver.core.DataType targetDataType;

    protected AbstractCassandraValueSaveStrategy(
        DataType sourceDataType, com.datastax.driver.core.DataType targetDataType)
    {
        this.sourceDataType = sourceDataType;
        this.targetDataType = targetDataType;
    }

    @Override
    public void saveValue(String columnName, Object value, Insert insert)
    {
        Object convertedValue = value;
        if (value != null)
        {
            convertedValue = convertValue(value);
        }
        insert.value(QueryBuilder.quote(columnName), convertedValue);
    }

    protected Object convertValue(Object value)
    {
        return value;
    }
}