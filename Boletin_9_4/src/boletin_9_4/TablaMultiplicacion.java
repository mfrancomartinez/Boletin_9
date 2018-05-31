/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_4;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class TablaMultiplicacion {
    
    int numero;
    
    public void tabla (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte numero: ");
        numero = sc.nextInt();
        do{
            System.out.println("Tabla de multiplicar: "+numero+ " "+(numero*2)+ " "+(numero*3)+" "+(numero*4)+" "+(numero*5)+" "+(numero*6)+" "+(numero*7)+" "+(numero*8)+ " "+(numero*9)+" "+(numero*10));
            
        }while (numero!=0);
    }
}
