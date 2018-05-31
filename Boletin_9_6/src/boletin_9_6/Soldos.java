/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_6;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Soldos {
    int i;
    int soldo;
    int soldomilmilsetcinq;
    int soldomenosmil;
    public void datossoldos(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escribe o seguinte soldo: ");
            soldo = sc.nextInt();
            i++;
            if (soldo>=1000 && soldo<=1750){
                soldomilmilsetcinq= soldomilmilsetcinq+1;
            }else if (soldo<1000){
                soldomenosmil = soldomenosmil+1;
            }else if (soldo<0){
                System.out.print("error");
                i--;
            }
            
        }while(soldo!=0);
        System.out.println("Trabajadores que ganan entre 1000 y 1750: "+soldomilmilsetcinq);
        System.out.println("Trabajadores que ganan menos de 1000: "+(soldomenosmil*100)/(soldomenosmil+soldomilmilsetcinq)+"%");
    }
}
