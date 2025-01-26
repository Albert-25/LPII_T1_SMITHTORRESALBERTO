package model;

import javax.persistence.*;

@Entity
@Table(name = "TBL_USUARIOT1")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarioT1;
    private String usuarioT1;
    private String passwordT1;

    public int getIdUsuarioT1() { return idUsuarioT1; }
    public void setIdUsuarioT1(int idUsuarioT1) { this.idUsuarioT1 = idUsuarioT1; }
    public String getUsuarioT1() { return usuarioT1; }
    public void setUsuarioT1(String usuarioT1) { this.usuarioT1 = usuarioT1; }
    public String getPasswordT1() { return passwordT1; }
    public void setPasswordT1(String passwordT1) { this.passwordT1 = passwordT1; }
}
