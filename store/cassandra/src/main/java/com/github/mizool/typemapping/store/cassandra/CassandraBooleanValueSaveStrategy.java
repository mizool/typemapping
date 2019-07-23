package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraBooleanValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraBooleanValueSaveStrategy()
    {
        super(DataType.BOOLEAN, com.datastax.driver.core.DataType.cboolean());
    }
}