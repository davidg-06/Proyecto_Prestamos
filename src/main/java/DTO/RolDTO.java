
package DTO;

public class RolDTO {
    public int id_rol;
    public String descripcion;

    public RolDTO() {
    }

    public RolDTO(int id_rol) {
        this.id_rol = id_rol;
    }

    public RolDTO(int id_rol, String descripcion) {
        this.id_rol = id_rol;
        this.descripcion = descripcion;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "RolDTO{" + "id_rol=" + id_rol + ", descripcion=" + descripcion + '}';
    }
    
}
