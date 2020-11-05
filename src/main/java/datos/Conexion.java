package datos;

import java.sql.*;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bd_prestamos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublickeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PaSSWORD = "admin";

    private static BasicDataSource datasource;

    public static BasicDataSource getDataSource() {
        if (datasource == null) {
            datasource = new BasicDataSource();
            datasource.setUrl(JDBC_URL);
            datasource.setUsername(JDBC_USER);
            datasource.setPassword(JDBC_PaSSWORD);
            datasource.setInitialSize(50);

        }

        return datasource;

    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();

    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void close(PreparedStatement stmt) {
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn) {

        try {
            conn.close();
            System.err.println("entro la conexion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("no hay conexion a la base de datos ");
        }
    }

}
