package config;

import java.util.Scanner;

public class Config{
    public static void main(String[] args){
        // TODO code application logic here
        int paquete;
        double monto, diferencia, descuento, total;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de paquetes");
        paquete = teclado.nextInt();
        
        if (paquete < 5){
            System.out.println("No se permiten ventas minoristas");
            System.out.println("Cantidad de paquetes mayores a cinco");
        }
        else{
            System.out.println("Ingrese 8el monto total de la compra");
            teclado = new Scanner (System.in);
            monto = teclado.nextDouble();
            
            if(paquete >= 5 && paquete <= 15){
                monto += 10;
                
                System.out.println("El costo de envio es de 10 USD");
                System.out.println("Muchas gracias por su compra");
            }
            else{
                System.out.println("Usted no tiene cobro de envio");
                System.out.println("Muchas gracias por su compra");
            }
            if (monto < 100){
                diferencia = 100 - monto;
                
                System.out.println("El monto es menor a 100 USD por lo que no posee promociones");
                System.out.println("Necesita comprar " + diferencia + " USD para entrar en la promo");
            }
            else{
                if (monto >= 100 && monto <= 300){
                    descuento = monto * 0.05;
                    total = monto - descuento;
                    
                    System.out.println("Por su compra tiene un descuento del 5%");
                    System.out.println("El monto total con descuento es de: " + total);
                }
                else{
                    descuento = monto * 0.1;
                    total = monto - descuento;
                    
                    System.out.println("Por su compra tiene un descuento del 10%");
                    System.out.println("El monto total con descuento es de: " + total);
                }
            }
        }
    }
}