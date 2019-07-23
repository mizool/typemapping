package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.github.mizool.typemapping.business.DataType;

class JdbcLongValueLoadStrategy extends AbstractJdbcValueLoadStrategy
{
    public JdbcLongValueLoadStrategy()
    {
        super(Types.BIGINT, DataType.LONG);
    }

    @Override
    public Object loadValue(String columnName, ResultSet resultSet) throws SQLException
    {
        Long result = resultSet.getLong(columnName);
        if (resultSet.wasNull())
        {
            result = null;
        }
        return result;
    }
}