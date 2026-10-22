/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_DESCUENTO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String credencial, credencial2, estudiante;
      int edad;
      
      Scanner captu = new Scanner(System.in);
      System.out.println("Cual es tu edad?: ");
      edad = captu.nextInt();
      captu.nextLine();
       System.out.println("Eres estudiante?: ");
      estudiante = captu.nextLine();
       System.out.println("Tienes credencial?: ");
       credencial = captu.nextLine();
       System.out.println("Tienes mas de 60 años?: ");
       
        System.out.println("Tienes credencial del INSEN?; ");
        credencial2 = captu.nextLine();
       
      
   }
   
}
