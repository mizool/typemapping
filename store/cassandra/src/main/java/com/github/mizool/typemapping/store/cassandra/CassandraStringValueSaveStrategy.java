package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraStringValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraStringValueSaveStrategy()
    {
        super(DataType.STRING, com.datastax.driver.core.DataType.text());
    }
}