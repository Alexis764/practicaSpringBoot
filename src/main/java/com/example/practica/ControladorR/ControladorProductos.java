package com.example.practica.ControladorR;


import com.example.practica.EntidadesR.Productos;
import com.example.practica.ServiciosR.servicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductos {

    servicioProductos servicio = new servicioProductos();


    @GetMapping("/listarproductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/listarcantidad")
    public int cantidadproductos(){
        return servicio.cantidad();
    }

    @GetMapping("/listartotal")
    public ArrayList<Productos> total(){
        return servicio.total();
    }

    @GetMapping("/totalproductos")
    public int totalproductos(){
        return servicio.totalSuma();
    }
}
