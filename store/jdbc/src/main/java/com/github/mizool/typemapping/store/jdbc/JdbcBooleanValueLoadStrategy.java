package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.github.mizool.typemapping.business.DataType;

class JdbcBooleanValueLoadStrategy extends AbstractJdbcValueLoadStrategy
{
    public JdbcBooleanValueLoadStrategy()
    {
        super(Types.BOOLEAN, DataType.BOOLEAN);
    }

    @Override
    public Object loadValue( String columnName, ResultSet resultSet) throws SQLException
    {
        Boolean result = resultSet.getBoolean(columnName);
        if (resultSet.wasNull())
        {
            result = null;
        }
        return result;
    }
}