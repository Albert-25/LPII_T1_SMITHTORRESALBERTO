package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_PRODUCTOT1")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductoT1;
    private String nombreT1;
    private double precioT1;
    private String descripcionT1;
    private String estadoT1;
    @Temporal(TemporalType.DATE)
    private Date fechaVencimT1;
    @Temporal(TemporalType.DATE)
    private Date fechaFabriT1;
}
