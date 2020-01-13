package com.github.mizool.typemapping.store.jdbc;

import java.util.Set;

import lombok.Getter;

import com.github.mizool.typemapping.business.DataType;
import com.google.common.collect.ImmutableSet;

abstract class AbstractJdbcValueLoadStrategy implements JdbcValueLoadStrategy
{
    @Getter
    private final Set<Integer> sourceColumnTypes;

    @Getter
    private final DataType targetDataType;

    protected AbstractJdbcValueLoadStrategy(Integer sourceColumnType, DataType targetDataType)
    {
        this(ImmutableSet.of(sourceColumnType), targetDataType);
    }

    protected AbstractJdbcValueLoadStrategy(Set<Integer> sourceColumnTypes, DataType targetDataType)
    {
        this.sourceColumnTypes = ImmutableSet.copyOf(sourceColumnTypes);
        this.targetDataType = targetDataType;
    }
}