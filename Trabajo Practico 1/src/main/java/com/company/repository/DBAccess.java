package com.company.repository;

import java.sql.*;

public class DBAccess {

    public DBAccess(){}

    public void getLibrary(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e)
        {
            System.out.println("No MySQL Library");
        }
    }

    public void insertWinners(String winner_name, int drinkInBlood) throws SQLException {
        try {

            Connection connection = null;
            String myUrl = "jdbc:mysql://localhost:3306/tpvikingsspartans?serverTimezone=UTC";
            connection = DriverManager.getConnection(myUrl,"root","sasa");

            String query = "INSERT INTO winners (winner_name, drinkInBlood) values (?, ?);";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, winner_name);
            ps.setInt(2, drinkInBlood);

            ps.execute();

            connection.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void getWinners() throws SQLException{
        try {

            Connection connection = null;
            String myUrl = "jdbc:mysql://localhost:3306/tpvikingsspartans?serverTimezone=UTC";
            connection = DriverManager.getConnection(myUrl,"root","sasa");

            String query = "SELECT * FROM winners;";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.execute();

            connection.close();
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

}
