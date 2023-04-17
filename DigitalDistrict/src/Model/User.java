package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    DBConnection db= new DBConnection();
    Statement stm = null;
    String DBtable="user";
    String DBid="id", DBname="name", DBCIN="CIN", DBpassword="password";
    private byte id;
    private String name;
    private String CIN;
    private String password;

    public User(String name, String CIN, String password) {
        this.name = name;
        this.CIN = CIN;
        this.password = password;

        try{
            stm = db.getCon().createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean Login(){
        try {
            String sql="SELECT * FROM "+DBtable+";";
            ResultSet rs= stm.executeQuery(sql);
            while (rs.next()){
                String name= rs.getString("name");
                String CIN= rs.getString("CIN");
                String password= rs.getString("password");
                if (this.name==name && this.CIN==CIN && this.password==password){
                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


}

