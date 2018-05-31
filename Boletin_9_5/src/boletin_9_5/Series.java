/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_5;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Series {
    int x = 2;
    int y = -1;
    int z = 0;
    int zs = 1;
    int e;
    int i;
    int l;
    
    
    
    Scanner sc = new Scanner(System.in);
    int longitudserie = sc.nextInt();
    
    public void primeraserie(){
        System.out.println(x);
        for(e=1;e<=longitudserie;e++){
        x = x+2;
        System.out.println("+"+x);
        
    }
        
     
    }
    public void segundaserie(){
        System.out.println(y);
        
        for(i = 1; i<=longitudserie;i++){
            y = y+1;
            if (y%2 != 0){
                System.out.println("+"+ y);
                                   
                       
            }else{
                System.out.println("-"+y);
            }
        }
    }
    public void terceraserie(){        
        
        for(l=1;l<=longitudserie;l++){
            System.out.println(z+", ");
            int var = z;
            z = zs;
            zs = var + zs;
        }
    }
}
