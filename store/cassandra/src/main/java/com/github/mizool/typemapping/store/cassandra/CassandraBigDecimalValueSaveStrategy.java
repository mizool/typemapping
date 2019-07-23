package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraBigDecimalValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraBigDecimalValueSaveStrategy()
    {
        super(DataType.BIG_DECIMAL, com.datastax.driver.core.DataType.decimal());
    }
}