

import java.sql.*;

public class DBConnection {

    public Connection connection=null;
    PreparedStatement preparedStatement=null;
    public DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             connection= DriverManager.getConnection                ("jdbc:mysql://localhost:3306/servletdb","root","ankit_mysql");


        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }


    public int getBlogId() {
        int maxid = 0;
        try {
            preparedStatement = connection.prepareStatement("select max(b_id) from blog ");
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            maxid = rs.getInt("max(b_id)");

        } catch (SQLException ex) {
            System.out.println(ex);
            return maxid;
        }
        return maxid;
    }



    public String save(int bid,String bdata){
        try {
            preparedStatement = connection.prepareStatement("insert into blog (b_id,data) values(?,?)");
            preparedStatement.setInt(1,bid);
            preparedStatement.setString(2,bdata);
            preparedStatement.executeUpdate();
            return "Your Blog is Successfully Stored";
        }
        catch (SQLException ex){
            return "error";
        }
        }

    public static void main(String[] args) {
        System.out.println(new DBConnection().getBlogId());
    }
}
