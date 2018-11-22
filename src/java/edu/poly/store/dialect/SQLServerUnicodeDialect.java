/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.store.dialect;

import java.sql.Types;
import org.hibernate.type.StandardBasicTypes;

/**
 * Custom SQL Server Dialect using for hibernate to support Unicode
 * @author Nguyen Ngoc Anh - Email: anhnnpmp@gmail.com - Tel: 0905.119948
 */
public class SQLServerUnicodeDialect extends org.hibernate.dialect.SQLServerDialect {
    public SQLServerUnicodeDialect() {
        super();
        registerColumnType(Types.CHAR, "nchar(1)");
        registerColumnType(Types.LONGVARCHAR, "nvarchar(max)" );
        registerColumnType(Types.VARCHAR, 4000, "nvarchar($l)");
        registerColumnType(Types.VARCHAR, "nvarchar(max)");
        registerColumnType(Types.CLOB, "nvarchar(max)" );

        registerColumnType(Types.NCHAR, "nchar(1)");
        registerColumnType(Types.LONGNVARCHAR, "nvarchar(max)");
        registerColumnType(Types.NVARCHAR, 4000, "nvarchar($l)");
        registerColumnType(Types.NVARCHAR, "nvarchar(max)");
        registerColumnType(Types.NCLOB, "nvarchar(max)");

        registerHibernateType(Types.NCHAR, StandardBasicTypes.CHARACTER.getName());
        registerHibernateType(Types.LONGNVARCHAR, StandardBasicTypes.TEXT.getName());
        registerHibernateType(Types.NVARCHAR, StandardBasicTypes.STRING.getName());
        registerHibernateType(Types.NCLOB, StandardBasicTypes.CLOB.getName() );
    }
}