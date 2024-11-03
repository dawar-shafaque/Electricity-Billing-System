package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    Connection connection;
    Statement statement;
    Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bill_System", "root", "Dawar@LM10");
            statement = connection.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
