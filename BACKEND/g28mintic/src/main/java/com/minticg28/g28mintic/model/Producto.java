package com.minticg28.g28mintic.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//BONIER YESID GARCIA CANTILLO


@Document(value = "Producto")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Producto {

    @Id
    private String id;
    private String nombreProducto;
    private float precio;
    private String categoria;
    private float descuento;
    private int cantidad_total;
    private int existencia;
    private String marca;
    
}
