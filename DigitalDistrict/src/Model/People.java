package Model;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class People {
    DBConnection db = new DBConnection();
    Statement stm = null;

    // NOM DU TABLE ET LES PROPRIETE DANS LA BASE DE DONNEE
    String DBtable = "people";                  //NOM DU TABLE
    String DBid ="id", DBfirstName="firstName", DBlastName="lastName", DBbirthDate="birthDate";
    String DBbirthPlace="birthPlace", DBCIN="CIN", DBaddress="address";

    //
    //private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthPlace;
    private String CIN;
    private String address;

    public People(String firstName, String lastName, String birthDate, String birthPlace, String CIN, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
        this.CIN = CIN;
        this.address = address;

        try {
            stm= db.getCon().createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Add(){
        try{
            String sqlINSERT="INSERT INTO "+DBtable+" ("+DBfirstName+","+DBlastName+","+DBbirthDate+","+DBbirthPlace+","+DBCIN+","+DBaddress+")";
            String sqlVALUES=" VALUES ('"+this.firstName+"','"+this.lastName+"','"+this.birthDate+"','"+this.birthPlace+"','"+this.CIN+"','"+this.address +"');";
            stm.executeUpdate(sqlINSERT+sqlVALUES);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void Remove(int id){
        try{
            stm.executeUpdate("DELETE FROM "+DBtable+" WHERE "+DBid+"='"+id+"';");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void Update(int id,String firstName,String lastName,String birthDate,String birthPlace,String CIN,String address){
        try{
            String sqlSET=" SET "+DBfirstName+"='"+firstName+"', "+DBlastName+"='"+lastName+"', "+DBbirthDate+"='"+birthDate+"', "+DBbirthPlace+"='"+birthPlace+"', "+DBCIN+"='"+CIN+"', "+DBaddress+"='"+address+"'";
            stm.executeUpdate("UPDATE "+DBtable+sqlSET+" WHERE "+DBid+"="+id+";");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
