package utn.classes;

import java.sql.*;

public class Conectar {
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "batallafrescas";
    String user = "root";
    String pass = "";

    public Conectar() {
    }

    public void setGanadores(String query) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, user, pass);
            Statement st = null;
            st = conn.createStatement();
            st.executeUpdate(query);

        } catch (
                SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getGanadores() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, user, pass);
            PreparedStatement st = null;
            st = conn.prepareStatement("select * from ganadores;");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("\nNombre:"+rs.getString("nombre"));
                System.out.println("Cantidad tomada:"+rs.getString("cantidad_bebida"));
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
