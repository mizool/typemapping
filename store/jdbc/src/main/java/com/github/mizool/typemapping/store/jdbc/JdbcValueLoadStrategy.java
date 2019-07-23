package com.github.mizool.typemapping.store.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import com.github.mizool.typemapping.business.DataType;

public interface JdbcValueLoadStrategy
{
    Set<Integer> getSourceColumnTypes();

    DataType getTargetDataType();

    Object loadValue(String columnName, ResultSet resultSet) throws SQLException;
}