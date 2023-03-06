package com.example.practica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
public class Controladores {

    @RequestMapping("/suma")
    public String suma() {
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        num2 = entrada.nextInt();

        return "La suma de " + num1 + " + " + num2 + " = "+(num1+num2);
    }

    @RequestMapping("/lista")
    public ArrayList<String> listaCompra() {
        ArrayList<String> compra = new ArrayList<String>();
        Scanner entrada = new Scanner(System.in);

        String listaOrdenada = "", producto;
        int cantidadProductos;

        System.out.print("Digite la cantidad de productos: ");
        cantidadProductos = entrada.nextInt();

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Digite el " + (i+1) + " producto: ");
            producto = entrada.next();
            compra.add(producto);
        }

        return compra;
    }

}

