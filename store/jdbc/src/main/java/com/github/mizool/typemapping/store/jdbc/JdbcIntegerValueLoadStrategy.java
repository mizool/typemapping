package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.github.mizool.typemapping.business.DataType;
import com.google.common.collect.ImmutableSet;

class JdbcIntegerValueLoadStrategy extends AbstractJdbcValueLoadStrategy
{
    public JdbcIntegerValueLoadStrategy()
    {
        super(ImmutableSet.of(Types.INTEGER, Types.TINYINT), DataType.INTEGER);
    }

    @Override
    public Object loadValue(String columnName, ResultSet resultSet) throws SQLException
    {
        Integer result = resultSet.getInt(columnName);
        if (resultSet.wasNull())
        {
            result = null;
        }
        return result;
    }
}