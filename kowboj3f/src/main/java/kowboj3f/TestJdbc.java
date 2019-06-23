package kowboj3f;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class TestJdbc {

    String jdbcUrl = "jdbc:mysql://localhost:3306/sfg_prod?useSSL=false&serverTimezone=UTC";
    String user = "sfg_prod_user";
    String pass = "pas1";


    Connection myConn = null;{

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        myConn = DriverManager.getConnection(jdbcUrl, user, pass);
        }

        catch(SQLException e) {
        e.printStackTrace();
        }

        catch(ClassNotFoundException e) {
        e.printStackTrace();
        }
    }
}