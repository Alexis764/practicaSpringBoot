package com.example.practica.Servicios;

import com.example.practica.Entidades.ProductosAlexis;

import java.util.ArrayList;

public class ServicioProductosAlexis {

    private ArrayList<ProductosAlexis> lista = new ArrayList<>();

    public ServicioProductosAlexis() {
        lista.add(new ProductosAlexis(1, 50, "Manzana", "Frutas", 5800.0, 0));
        lista.add(new ProductosAlexis(2, 320, "Papa", "Vegetales", 2500.0, 0));
        lista.add(new ProductosAlexis(3, 210, "Fresa", "Frutas", 4500.0, 0));
        lista.add(new ProductosAlexis(4, 89, "Jabon de baño", "Aseo", 9800.0, 0));
        lista.add(new ProductosAlexis(5, 56, "Frijol", "Grano", 15800.0, 0));
    }

    public ArrayList<ProductosAlexis> mostrarLista() {
        return lista;
    }

    public int cantidadProductos() {
        return lista.size();
    }

}
