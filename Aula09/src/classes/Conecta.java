package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {
    public static Connection getConexao() throws Exception {
        Connection con = null;

        String serverName = "localhost";
        String myDataBase = "aluno";

        String userName = "root";
        String password = "";

        String driveName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driveName);

        String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
        con =  DriverManager.getConnection(url, userName, password);

        return con;
    }
}
