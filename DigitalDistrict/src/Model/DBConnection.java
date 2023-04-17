package Model;

import java.sql.*;

public class DBConnection {
    Connection con = null;
    public DBConnection(){
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost/digitaldistrict","root","");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Connection getCon(){
        return con;
    }
}
