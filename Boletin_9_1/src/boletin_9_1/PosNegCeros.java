/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_1;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class PosNegCeros {
    
    int e = 0;
    int pos;
    int neg;
    int zero;
    int numero;
    
    Scanner sc = new Scanner(System.in);
    
    public void contarNumero(){        
        while (e<10){
            numero = sc.nextInt();
            if (numero>0 ){
                pos = pos+1;
            }else if(numero<0){
                neg = neg+1;
            }else{
                zero = zero+1;
            }            
            e++;
        }
        System.out.println("Recuento: "+"positivos: "+pos+"negativos: "+neg+"ceros: "+zero);
    }
}
