/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_23_CAPTURAR {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int cant, califa;
      double promedio;
      califa = 0;
      Scanner captu = new Scanner(System.in);
       System.out.println("cuantas calificaciones vas a capturar?");
       cant = captu.nextInt();
       captu.nextLine();
       for(int i = 0; i < cant; i++ ){
          System.out.println("Capturar la calificacion: "); 
          califa = califa + captu.nextInt();
          captu.nextLine();
          
        System.out.println("acumlulado = " + califa);
        promedio = califa / cant;
                System.out.println("); 

        
       
   }
   }
   
}
