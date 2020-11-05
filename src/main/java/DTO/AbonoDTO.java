
package DTO;

import java.util.Date;


public class AbonoDTO {
    public int id_abono;
    public Date fecha_abono;
     public AbonoDTO PrestamoDTO;
     public double valor_abonado;

    public AbonoDTO() {
    }

    public AbonoDTO(int id_abono) {
        this.id_abono = id_abono;
    }

    public AbonoDTO(int id_abono, Date fecha_abono, AbonoDTO PrestamoDTO, double valor_abonado) {
        this.id_abono = id_abono;
        this.fecha_abono = fecha_abono;
        this.PrestamoDTO = PrestamoDTO;
        this.valor_abonado = valor_abonado;
    }

    public int getId_abono() {
        return id_abono;
    }

    public void setId_abono(int id_abono) {
        this.id_abono = id_abono;
    }

    public Date getFecha_abono() {
        return fecha_abono;
    }

    public void setFecha_abono(Date fecha_abono) {
        this.fecha_abono = fecha_abono;
    }

    public AbonoDTO getPrestamoDTO() {
        return PrestamoDTO;
    }

    public void setPrestamoDTO(AbonoDTO PrestamoDTO) {
        this.PrestamoDTO = PrestamoDTO;
    }

    public double getValor_abonado() {
        return valor_abonado;
    }

    public void setValor_abonado(double valor_abonado) {
        this.valor_abonado = valor_abonado;
    }

    @Override
    public String toString() {
        return "AbonoDTO{" + "id_abono=" + id_abono + ", fecha_abono=" + fecha_abono + ", PrestamoDTO=" + PrestamoDTO + ", valor_abonado=" + valor_abonado + '}';
    }
     
    
}
