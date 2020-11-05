
package DTO;

public class InteresDTO {
    public int id_interes;
    public String descripcion;
    public double valor_interes;

    public InteresDTO() {
    }

    public InteresDTO(int id_interes) {
        this.id_interes = id_interes;
    }

    public InteresDTO(int id_interes, double valor_interes) {
        this.id_interes = id_interes;
        this.valor_interes = valor_interes;
    }

    public InteresDTO(int id_interes, String descripcion, double valor_interes) {
        this.id_interes = id_interes;
        this.descripcion = descripcion;
        this.valor_interes = valor_interes;
    }

    public int getId_interes() {
        return id_interes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor_interes() {
        return valor_interes;
    }

    @Override
    public String toString() {
        return "InteresDTO{" + "id_interes=" + id_interes + ", descripcion=" + descripcion + ", valor_interes=" + valor_interes + '}';
    }
    
}
