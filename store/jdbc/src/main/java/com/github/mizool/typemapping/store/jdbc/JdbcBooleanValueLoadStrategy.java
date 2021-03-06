package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.github.mizool.typemapping.business.DataType;
import com.google.common.collect.ImmutableSet;

class JdbcBooleanValueLoadStrategy extends AbstractJdbcValueLoadStrategy
{
    public JdbcBooleanValueLoadStrategy()
    {
        super(ImmutableSet.of(Types.BOOLEAN, Types.BIT), DataType.BOOLEAN);
    }

    @Override
    public Object loadValue(String columnName, ResultSet resultSet) throws SQLException
    {
        Boolean result = resultSet.getBoolean(columnName);
        if (resultSet.wasNull())
        {
            result = null;
        }
        return result;
    }
}