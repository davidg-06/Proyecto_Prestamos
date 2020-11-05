
package DTO;

import java.util.Date;


public class PrestamoDTO {
    
   public int id_prestamo;
   public PrestamoDTO UsuarioDTO;
   public Date fecha_inicial;
   public Date fecha_final;
   public PrestamoDTO InteresDTO;
   public double valor_credito;
   public double credito_mas_interes;
   public String Status_usuario;
   public PrestamoDTO AbonoDTO;
   public PrestamoDTO MoraDTO;

    public PrestamoDTO() {
        
    }


    public PrestamoDTO(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public PrestamoDTO(int id_prestamo, PrestamoDTO UsuarioDTO, Date fecha_inicial, Date fecha_final, PrestamoDTO InteresDTO, double valor_credito, double credito_mas_interes, String Status_usuario, PrestamoDTO AbonoDTO, PrestamoDTO MoraDTO) {
        this.id_prestamo = id_prestamo;
        this.UsuarioDTO = UsuarioDTO;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.InteresDTO = InteresDTO;
        this.valor_credito = valor_credito;
        this.credito_mas_interes = credito_mas_interes;
        this.Status_usuario = Status_usuario;
        this.AbonoDTO = AbonoDTO;
        this.MoraDTO = MoraDTO;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public PrestamoDTO getUsuarioDTO() {
        return UsuarioDTO;
    }

    public void setUsuarioDTO(PrestamoDTO UsuarioDTO) {
        this.UsuarioDTO = UsuarioDTO;
    }

    public Date getFecha_inicial() {
        return fecha_inicial;
    }

    public void setFecha_inicial(Date fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public PrestamoDTO getInteresDTO() {
        return InteresDTO;
    }

    public void setInteresDTO(PrestamoDTO InteresDTO) {
        this.InteresDTO = InteresDTO;
    }

    public double getValor_credito() {
        return valor_credito;
    }

    public void setValor_credito(double valor_credito) {
        this.valor_credito= valor_credito;
    }

    public double getCredito_mas_interes() {
        return credito_mas_interes;
    }

    public void setCredito_mas_interes(double credito_mas_interes) {
        this.credito_mas_interes = credito_mas_interes;
    }

    public String getStatus_usuario() {
        return Status_usuario;
    }

    public void setStatus_usuario(String Status_usuario) {
        this.Status_usuario = Status_usuario;
    }

    public PrestamoDTO getAbonoDTO() {
        return AbonoDTO;
    }

    public void setAbonoDTO(PrestamoDTO AbonoDTO) {
        this.AbonoDTO = AbonoDTO;
    }

    public PrestamoDTO getMoraDTO() {
        return MoraDTO;
    }

    public void setMoraDTO(PrestamoDTO MoraDTO) {
        this.MoraDTO = MoraDTO;
    }

    @Override
    public String toString() {
        return "PrestamoDTO{" + "id_prestamo=" + id_prestamo + ", UsuarioDTO=" + UsuarioDTO + ", fecha_inicial=" + fecha_inicial + ", fecha_final=" + fecha_final + ", InteresDTO=" + InteresDTO + ", valor_credito=" + valor_credito + ", credito_mas_interes=" + credito_mas_interes + ", Status_usuario=" + Status_usuario + ", AbonoDTO=" + AbonoDTO + ", MoraDTO=" + MoraDTO + '}';
    }

    void valor_credito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
}
