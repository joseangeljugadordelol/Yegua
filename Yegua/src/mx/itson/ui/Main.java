/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.ui;

import java.util.Scanner;
import mx.itson.entidades.Articulos;
import mx.itson.entidades.Venta;

/**
 *
 * @author ABCDE-SONY
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es el nombre del cliente");
        String nombrecliente = scanner.nextLine();
        System.out.println("cual es el nombre del articulo");
        String nombrearticulo = scanner.nextLine();
        
        System.out.println("su articulo es alimento? seleciones la opcion 1 o la opcion 2 (1).si (2).no");
        String comida = scanner.nextLine();
        
        Articulos a = new Articulos();
        a.setnombre();
        a.setprecio();
        a.setcategoria();
       
        Venta b = new Venta();
        b.setscliente(nombrecliente);
        b.settipo();
        b.setsubtotal();
        b.setdescuento();
        b.settotal();
        b.setarticulos();
        
        
        
        /* mis 50 minutos lo que queria hacer 
        
        if(comida.equals("1")) {
            System.out.println("cual es el precio del articulo");
            String precioarticulocondescuento = scanner.nextLine();
            String opcion ="1";
                if(opcion.equals("1")) {
                    System.out.println("usted no tiene que pagar interes" );
                
                }
                
        }
        if(comida.equals("2")) {
            System.out.println("cual es el precio del articulo");
            String precioarticulosindescuento = scanner.nextLine();
            System.out.println("selecione una opcion 1 o 2 (1). credito (2).contado");
            String opcion = scanner.nextLine();
            
                if(opcion.equals("1")) {
                    System.out.println("usted no tiene que pagar interes" );
                
                }
                if(opcion.equals("2")) {
                    System.out.println("usted tiene que pagar interes" );
                
                }
                
        }
        */
        
        
        
    }
    
}
