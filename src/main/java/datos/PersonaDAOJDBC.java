package datos;

import DTO.UsuarioDTO;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.*;

public class PersonaDAOJDBC {
    
  
     private static final String SQL_SELECT ="select * from tbl_usuario inner join tbl_prestamo on tbl_usuario.id_usuario = tbl_prestamo.id_usuario";
 
    private static final String SQL_SELECT_BY_ID =//"select id_usuario, cedula, nombre, apellido,correo, direccion, telefono, id_rol, contrasena from tbl_usuario where id_usuario=?";
           "Select usr.*, pre.id_usuario, valor_credito from tbl_usuario usr inner join tbl_prestamo pre ON usr.id_usuario = pre.id_usuario where usr.id_usuario=?";

    private static final String SQL_INSERT = "INSERT INTO `bd_prestamos`.`tbl_usuario` (`cedula`, `nombre`, `apellido`, `correo`, `direccion`, `telefono`, `id_rol`, `contrasena`) VALUES (?,?,?,?,?,?, ?,?); ";
    private static final String SQL_UPDATE ="Update  `bd_prestamos`.`tbl_usuario` us INNER JOIN tbl_prestamo pr ON us.id_usuario = pr.id_usuario SET us.cedula ='?', us.nombre = '?', us.apellido='?',us.correo ='?', us.direccion ='?', us.telefono ='?', us.id_rol ='?', us.contrasena ='?', pr.valor_credito='?' WHERE us.id_usuario =?";
            //"Update tbl_usuario SET cedula=?, nombre=?, apellido=?, correo=?, direccion=?,telefono=?,contrasena=?, Valor_credito=? where id_cliente=?";
    private static final String SQL_DELETE = "DELETE from tbl_usuario where id_usuario=?";

    public List<UsuarioDTO> listar() {
        Connection conn = null;
        PreparedStatement stms = null;
        ResultSet rs = null;
        UsuarioDTO usuarioDTO = null;

        List<UsuarioDTO> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stms = conn.prepareStatement(SQL_SELECT);
            rs = stms.executeQuery();
            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                String cedula = rs.getString("cedula");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                int id_rol=rs.getInt("id_rol");
                String contrasena = rs.getString("contrasena");
                
                double valor_credito = rs.getDouble("valor_credito");

                UsuarioDTO usuario = new UsuarioDTO(id_usuario, cedula, nombre, apellido, correo, direccion, telefono, id_rol, contrasena, valor_credito);

                usuarios.add(usuario);
                System.out.println(usuario);
             

            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stms);
            Conexion.close(conn);
        }
        return usuarios;
    }

    public UsuarioDTO encontrar(UsuarioDTO usuarioDTO) {
        Connection conn = null;
        PreparedStatement stms = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stms = conn.prepareStatement(SQL_SELECT_BY_ID);
            stms.setInt(1, usuarioDTO.getId_usuario());
            rs = stms.executeQuery();
            
           System.out.println("los valores de SQL_SELECT_BY_ID  son "+ rs);
            rs.next();
           
              
            String cedula = rs.getString("cedula");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String correo = rs.getString("correo");
            String direccion = rs.getString("direccion");
            String telefono = rs.getString("telefono");
            int id_rol=rs.getInt("id_rol");
            String contrasena = rs.getString("contrasena");
           
            double valor_credito = rs.getDouble("valor_credito");

        
            usuarioDTO.setCedula(cedula);
            usuarioDTO.setNombre(nombre);
            usuarioDTO.setApellido(apellido);
            usuarioDTO.setCorreo(correo);
            usuarioDTO.setDireccion(direccion);

            
            usuarioDTO.setTelefono(telefono);
            usuarioDTO.setid_rol(id_rol);
            usuarioDTO.setContrasena(contrasena);
            usuarioDTO.setValor_credito(valor_credito);
 
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stms);
            Conexion.close(conn);
        }
        return usuarioDTO;

    }

    public int insertar(UsuarioDTO usuarioDTO) {
        Connection conn = null;
        PreparedStatement stms = null;
        
        int rows=0;

        try {
            conn = Conexion.getConnection();
            stms = conn.prepareStatement(SQL_INSERT);
            
            
            stms.setString(1, usuarioDTO.getCedula());
            stms.setString(2, usuarioDTO.getNombre());
            stms.setString(3, usuarioDTO.getApellido());
            stms.setString(4, usuarioDTO.getCorreo());
            stms.setString(5, usuarioDTO.getDireccion());
            stms.setString(6, usuarioDTO.getTelefono());
            stms.setInt(7, usuarioDTO.getid_rol());
            stms.setString(8, usuarioDTO.getContrasena());
           
            
            rows=stms.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            Conexion.close(stms);
            Conexion.close(conn);
        }
      return rows;
    }
public int actualizar (UsuarioDTO usuarioDTO){
    Connection conn = null;
        PreparedStatement stms = null;
        
        int rows=0;

        try {
            conn = Conexion.getConnection();
            stms = conn.prepareStatement(SQL_UPDATE);
            
           
            stms.setString(1, usuarioDTO.getCedula());
            stms.setString(2, usuarioDTO.getNombre());
            stms.setString(3, usuarioDTO.getApellido());
            stms.setString(4, usuarioDTO.getCorreo());
            stms.setString(5, usuarioDTO.getDireccion());
            stms.setString(6, usuarioDTO.getTelefono());
              stms.setInt(7, usuarioDTO.getid_rol());
            stms.setString(8, usuarioDTO.getContrasena());
           stms.setDouble(9, usuarioDTO.getValor_credito());
            stms.setInt(10, usuarioDTO.getId_usuario());
            
            rows=stms.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            Conexion.close(stms);
            Conexion.close(conn);
        }
      return rows;
}

public int eliminar (UsuarioDTO usuarioDTO){
     Connection conn = null;
        PreparedStatement stms = null;
        
        int rows=0;

        try {
            conn = Conexion.getConnection();
            stms = conn.prepareStatement(SQL_DELETE);
            
           
            
            stms.setInt(1, usuarioDTO.getId_usuario());
            
            rows=stms.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            Conexion.close(stms);
            Conexion.close(conn);
        }
      return rows;
}
}
