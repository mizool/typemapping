package com.github.mizool.typemapping.store.cassandra;

import com.datastax.driver.core.Row;
import com.github.mizool.typemapping.business.DataType;

public interface CassandraValueLoadStrategy
{
    com.datastax.driver.core.DataType getSourceDataType();

    DataType getTargetDataType();

    Object loadValue(String columnName, Row row);
}