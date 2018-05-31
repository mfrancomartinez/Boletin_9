/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_3;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Rectangulo {
    int base;
    int altura;
    int area;
    
    public void calcularArea(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserte base: ");
        base = sc.nextInt();
        System.out.println("Inserte altura: ");
        altura=sc.nextInt();
        if( base>0 && altura>0){
            area = base*altura;
            System.out.println("El area es: "+area);
        }else{
            System.out.println("No se puede calcular el área.");
        }
    }
}
