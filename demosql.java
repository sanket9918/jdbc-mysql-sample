import java.sql.*;
import java.util.*;

class demosql {
    static final String DbName = "sanket";
    static final String URL = "jdbc:mysql://localhost/" + DbName;
    static final String Username = "sanket";
    static final String Password = "sanket";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, Username, Password);
            String query = "SELECT * from EMPLOYEE";

            Statement dis = conn.createStatement();
            ResultSet rs = dis.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
                        + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));
            }
            sc.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}