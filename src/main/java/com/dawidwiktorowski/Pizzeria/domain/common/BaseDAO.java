package com.dawidwiktorowski.Pizzeria.domain.common;

import com.dawidwiktorowski.Pizzeria.config.DataSourceProvider;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class BaseDAO {
    private final DataSource dataSource;

    public BaseDAO(){
        try {
            this.dataSource= DataSourceProvider.getDaraSource();
        }catch (NamingException e){
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection(){
        try {
            return dataSource.getConnection();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
