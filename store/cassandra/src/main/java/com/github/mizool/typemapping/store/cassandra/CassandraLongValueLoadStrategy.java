package com.github.mizool.typemapping.store.cassandra;

import com.datastax.driver.core.Row;
import com.github.mizool.typemapping.business.DataType;

class CassandraLongValueLoadStrategy extends AbstractCassandraValueLoadStrategy
{
    public CassandraLongValueLoadStrategy()
    {
        super(com.datastax.driver.core.DataType.bigint(), DataType.LONG);
    }

    @Override
    public Object loadValue(String columnName, Row row)
    {
        return row.getLong(columnName);
    }
}