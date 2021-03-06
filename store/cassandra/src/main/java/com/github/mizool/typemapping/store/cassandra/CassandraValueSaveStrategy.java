package com.github.mizool.typemapping.store.cassandra;

import com.datastax.driver.core.querybuilder.Insert;
import com.github.mizool.typemapping.business.DataType;

public interface CassandraValueSaveStrategy
{
    DataType getSourceDataType();

    com.datastax.driver.core.DataType getTargetDataType();

    void saveValue(String columnName, Object value, Insert insert);
}