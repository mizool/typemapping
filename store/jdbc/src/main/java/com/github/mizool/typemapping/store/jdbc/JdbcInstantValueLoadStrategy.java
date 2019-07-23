package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.inject.Inject;

import com.github.mizool.typemapping.business.DataType;

class JdbcInstantValueLoadStrategy extends AbstractJdbcValueLoadStrategy
{
    private final JavaSqlTimestampConverter javaSqlTimestampConverter;

    @Inject
    public JdbcInstantValueLoadStrategy(JavaSqlTimestampConverter javaSqlTimestampConverter)
    {
        super(Types.TIMESTAMP, DataType.INSTANT);
        this.javaSqlTimestampConverter = javaSqlTimestampConverter;
    }

    @Override
    public Object loadValue(String columnName, ResultSet resultSet) throws SQLException
    {
        return javaSqlTimestampConverter.toPojo(resultSet.getTimestamp(columnName));
    }
}