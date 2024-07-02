/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Especificar que es una capa de datos
@Entity //Esta clase esta enlazada a una tabla en la base de datos
@Table(name="categoria") //Especificar cual entidad 

public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L; //Autoincremento en java
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    
    private Long idCategoria; //El long es para que pueda ser mas largo el numero
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    public Categoria() {
    }
    public Categoria(String categoria, boolean activo) {
        this.descripcion = categoria;
        this.activo = activo;
    }
}
