package com.github.mizool.typemapping.store.cassandra;

import com.datastax.driver.core.Row;
import com.github.mizool.typemapping.business.DataType;

class CassandraDoubleValueLoadStrategy extends AbstractCassandraValueLoadStrategy
{
    public CassandraDoubleValueLoadStrategy()
    {
        super(com.datastax.driver.core.DataType.cdouble(), DataType.DOUBLE);
    }

    @Override
    public Object loadValue(String columnName, Row row)
    {
        return row.getDouble(columnName);
    }
}