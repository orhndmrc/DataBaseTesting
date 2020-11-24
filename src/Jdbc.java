import java.sql.*;

public class Jdbc {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";

        Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "O405854d52.");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from transactions where branch='chicago';");

        while (rs.next()) {
            System.out.println(rs.getString("month"));

        }

        try{
            s.execute("use veli;");
            //s.execute("create table sun (name varchar(20), age int, year int);");
            //s.execute("insert into sun values('venus',29, 2020);");
            s.execute("insert into sun values('merkur',23, 2050);");

        }
        catch (SQLException e){
            System.out.println(e);

        }



    }
}
