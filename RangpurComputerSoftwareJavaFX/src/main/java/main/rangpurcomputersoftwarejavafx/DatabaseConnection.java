package main.rangpurcomputersoftwarejavafx;


import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://rcc-rcc-01.e.aivencloud.com:24545/defaultdb?useSSL=false&serverTimezone=UTC";
            String user = "avnadmin";
            String password = "AVNS_gp8Mso_kl0o_laNXtMl";

            Connection connect = DriverManager.getConnection(url, user, password);
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
