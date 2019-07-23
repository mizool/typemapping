package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraIntegerValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraIntegerValueSaveStrategy()
    {
        super(DataType.INTEGER, com.datastax.driver.core.DataType.cint());
    }
}