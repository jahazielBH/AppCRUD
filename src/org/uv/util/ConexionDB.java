/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author jahazielBH
 */
public class ConexionDB {

    private static ConexionDB instance = null;
    private Connection connection;

    private ConexionDB() {
        String urldb = "jdbc:postgresql://localhost:5433/crud";
        String username = "postgres";
        String password = "1999";
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(urldb, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.print("La conexión falló: " + ex.getMessage());
        }
        System.out.print("Conectado exitosamente");
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConexionDB getInstace() throws SQLException {
        if (instance == null || instance.getConnection().isClosed()) {
            instance = new ConexionDB();
        }
        return instance;
    }
}
