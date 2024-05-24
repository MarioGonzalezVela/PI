package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion extends AbstractConexion{

    private String url, user, pass;
    private static Connection conn;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.url = "jdbc:mysql://localhost:3306/proyecto_integrador";
            this.user = "root";
            this.pass= "";
            try {
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Conectado correctamente a la base de datos\n");

//                st = conn.createStatement();
//                query = "SELECT  * FROM recursos;";
//                rs = st.executeQuery(query);
//
//                while(rs.next()) {
//                    System.out.println(rs.getString(1));
//                }

            } catch (SQLException e) {
                System.out.println("Ha habido algún problema en la conexión");
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if(conn == null) {
            new Conexion();
        }
        return conn;
    }

 
}
