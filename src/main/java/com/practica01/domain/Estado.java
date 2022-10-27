package com.practica01.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nombreEstado;
    private String capital;
    private String poblacion;
    private String costas;

    public Estado(String nombreEstado, String capital, String poblacion, String costas) {
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
    public Estado(){
        
    }
}
