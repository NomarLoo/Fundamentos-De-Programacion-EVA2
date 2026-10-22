/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expreciones_booleanas;

/**
 *
 * @author Usuario
 */
public class EVA2_13_EXPRECIONES_BOOLEANAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      
      boolean entrarAntro, tieneCredencial = false;
      int edad = 18;
      
   entrarAntro = (edad >= 18) && (tieneCredencial == true);  
   System.out.println(entrarAntro);
   
   boolean estaSoleado = false, tienesDinero = false;
   boolean permisoSalir;
   permisoSalir = (estaSoleado == true) || (tienesDinero == true);
    System.out.println("permiso para salir de paseo: " + permisoSalir);
      
   }
   
}
