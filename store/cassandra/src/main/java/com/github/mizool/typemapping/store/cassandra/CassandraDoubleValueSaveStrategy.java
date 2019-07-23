package com.github.mizool.typemapping.store.cassandra;

import com.github.mizool.typemapping.business.DataType;

class CassandraDoubleValueSaveStrategy extends AbstractCassandraValueSaveStrategy
{
    public CassandraDoubleValueSaveStrategy()
    {
        super(DataType.DOUBLE, com.datastax.driver.core.DataType.cdouble());
    }
}