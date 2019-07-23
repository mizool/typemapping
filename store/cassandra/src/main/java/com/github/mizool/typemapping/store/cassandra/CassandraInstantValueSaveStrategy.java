package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraInstantValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraInstantValueSaveStrategy()
    {
        super(DataType.INSTANT, com.datastax.driver.core.DataType.timestamp());
    }
}