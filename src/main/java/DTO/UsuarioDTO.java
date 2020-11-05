package DTO;

public class UsuarioDTO extends PrestamoDTO{

    private int id_usuario;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String telefono;
    public int id_rol;
    private String contrasena;
   
    
    public UsuarioDTO(int id_Usuario){
        
    }

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id_Usuario, String cedula, String contrasena) {
        this.id_usuario = id_Usuario;
        this.cedula = cedula;
        this.contrasena = contrasena;
    
        
    }

    public UsuarioDTO(String cedula, String nombre, String apellido, String correo, String telefono, int id_rol, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.id_rol = id_rol;
        this.contrasena = contrasena;
    }



    public UsuarioDTO(int id_usuario, String cedula, String nombre, String apellido, String correo, String direccion, String telefono,int id_rol, String contrasena,double valor_credito) {
        
        
        
        super.valor_credito= valor_credito;
        this.id_usuario=id_usuario;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_rol=id_rol;
        this.contrasena = contrasena;
   
              System.out.println(getValor_credito());
       
    }

    public UsuarioDTO(int id_usuario, String cedula, String nombre, String apellido, String correo, String direccion, String telefono, String contrasena) {
  
        this.id_usuario = id_usuario;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
       
        this.contrasena = contrasena;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getid_rol() {
        return id_rol;
    }

    public void setid_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id_usuario=" + id_usuario + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", direccion=" + direccion + ", telefono=" + telefono + ", id_rol=" + id_rol + ", contrasena=" + contrasena + '}';
    }

    

    


    
}
