/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.store.dialect;

import java.sql.Types;
import org.hibernate.dialect.SQLServerDialect;


public class UnicodeSQLServerDialect extends SQLServerDialect {

    public UnicodeSQLServerDialect() {
        super();

        // Use Unicode Characters
        registerColumnType(Types.VARCHAR, 255, "nvarchar($l)");
        registerColumnType(Types.CHAR, "nchar(1)");
        registerColumnType(Types.CLOB, "nvarchar(max)");

        // Microsoft SQL Server 2000 supports bigint and bit
        registerColumnType(Types.BIGINT, "bigint");
        registerColumnType(Types.BIT, "bit");
    }
}
