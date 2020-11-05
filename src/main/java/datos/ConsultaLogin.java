
package datos;

import DTO.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultaLogin extends Conexion {
    
     private static final String SELECT ="SELECT * FROM tbl_usuario INNER JOIN tbl_rol ";
             //"SELECT cedula, contrasena from tbl_usuario";
    public boolean autenticacion(String cedula, String contrasena) throws SQLException{
         Connection conn = null;
        PreparedStatement stms = null;
        ResultSet rs = null;
        UsuarioDTO usuarioDTO = null;
        
       conn = Conexion.getConnection();
            stms = conn.prepareStatement(SELECT);
            rs = stms.executeQuery();
            
            while(rs.next()){
                if(cedula.equals(rs.getString("cedula"))&& contrasena.equals(rs.getString("contrasena")));
                return true;
                
            }
            return false;
    }

   
    
}
