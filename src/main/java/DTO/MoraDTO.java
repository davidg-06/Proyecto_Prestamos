
package DTO;


public class MoraDTO {
    public int id_mora;
    public double valor_mora;
    public String descripcion;

    public MoraDTO() {
    }

    public MoraDTO(int id_mora) {
        this.id_mora = id_mora;
    }

    public MoraDTO(int id_mora, double valor_mora) {
        this.id_mora = id_mora;
        this.valor_mora = valor_mora;
    }

    public MoraDTO(int id_mora, double valor_mora, String descripcion) {
        this.id_mora = id_mora;
        this.valor_mora = valor_mora;
        this.descripcion = descripcion;
    }

    public void setId_mora(int id_mora) {
        this.id_mora = id_mora;
    }

    public void setValor_mora(double valor_mora) {
        this.valor_mora = valor_mora;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MoraDTO{" + "id_mora=" + id_mora + ", valor_mora=" + valor_mora + ", descripcion=" + descripcion + '}';
    }
    
}
