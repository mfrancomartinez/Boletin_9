/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_2;

/**
 *
 * @author Marcos
 */
public class SumaProducto {
    int suma;
    int producto = 1;
    int num;
    
    public void suma(){
        for(num=10;num<=90;num++){
            suma = suma + num;            
        }
        System.out.println("La suma es: "+suma);
    }
    
    public void producto(){
        for (num=10;num<=90;num++){
            producto = producto * num;
        }
        System.out.println("El producto es: "+ producto);
    }
}
