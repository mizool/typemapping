package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.github.mizool.typemapping.business.DataType;
import com.google.common.collect.ImmutableSet;

class JdbcStringValueLoadStrategy extends AbstractJdbcValueLoadStrategy
{
    public JdbcStringValueLoadStrategy()
    {
        super(ImmutableSet.of(Types.VARCHAR, Types.CHAR, Types.LONGVARCHAR, Types.NVARCHAR), DataType.STRING);
    }

    @Override
    public Object loadValue(String columnName, ResultSet resultSet) throws SQLException
    {
        return resultSet.getString(columnName);
    }
}