/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author hanajjar
 */
public class DataSource {
    String myDriver = "com.mysql.jdbc.Driver";

    String url = "jdbc:mysql://localhost/testCovoiturage";

    String login = "root";
    String password = "";
    private Connection connection;
    private static DataSource instance;

    private DataSource() {
      try{
        connection=DriverManager.getConnection(url,login,password);
        System.out.println("connexion établie");    
        }catch(SQLException e){
//            e.printStackTrace();
            System.out.println("erreur à la connexion à la base des données");
}
    }

    public Connection getConnection() {
        return connection;
    }
    

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

}