/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpat2021;

import java.sql.*;

/**
 *
 * @author Sims <your.name at your.org>
 */
public class DB 
{
    //Variables required for SQL
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private String connectionStatus = "";
   
    
    //Establishes connection with access database
    public DB() throws SQLException
    {
      connection = DriverManager.getConnection("jdbc:ucanaccess://StokvelDB.accdb");
    }
    
    //Used to fetch data from database. SQL Query is in parameters
    public ResultSet select(String s) throws SQLException 
    {
        statement = connection.createStatement();
        resultSet = statement.executeQuery(s);
        return resultSet;
    }
    
    //Used to: insert into database, delete from database or update database. SQL Query is in parameters.
    public void query(String q) throws SQLException 
    {
        statement = connection.createStatement();
        statement.executeUpdate(q);
        statement.close();
    }
}
