/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_else_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_6_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        
        Scanner captu = new Scanner(System.in);
         System.out.println("Numeros del dia de la semana: [1 - 7] "); 
         dia = captu.nextInt();
         if(dia == 1){
             
              System.out.println("domingo");
         }else if(dia == 2){
              System.out.println("Lunes");
         }else if(dia == 3){
              System.out.println("Martes");
         }else if(dia == 4){
             System.out.println("miercoles");
              }else if(dia == 5){
              System.out.println("jueves");
         }else if(dia == 6){
              System.out.println("viernes");
         }else if(dia == 7){
              System.out.println("sabado");
              
             
         }
    }
    
}
