/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author diabl
 */
public class Ejercicio13 {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int lado;
        System.out.println("Ingrese los lados que desea dibujar");
        lado=leer.nextInt();
        pintar(lado);
    }
    public static void pintar(int lado){
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if(i==0 || i==lado-1){
                    System.out.print("*");
                }else if(j==0 || j==lado-1){
                    System.out.print("*");
                }else{
                
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
/*System.out.println("Ingrese tamaño del cuadrado:");
            tam = sc.nextInt();
            pintar(tam);
    }
    
    public static void pintar(int tam){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if(i==0 || i==tam-1){
                    System.out.print("*");
                }else if(j==0 || j==tam-1){
                    System.out.print("*");
                }else{
                
                    System.out.print(" ");}
            }
            System.out.println(" ");
        }
    }
*/