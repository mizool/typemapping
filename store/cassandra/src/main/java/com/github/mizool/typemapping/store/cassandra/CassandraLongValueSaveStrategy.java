package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraLongValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraLongValueSaveStrategy()
    {
        super(DataType.LONG, com.datastax.driver.core.DataType.bigint());
    }
}