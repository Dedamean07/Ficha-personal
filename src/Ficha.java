/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Denis
 */
public class Ficha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner dato= new Scanner (System.in);
        String nombre;
        int edad;
        char sexo;
        boolean casado;
        
                System.out.print("Ingrese su nombre: ");
                nombre=dato.next();
                
                System.out.print("Ingrese su edad: ");
                edad=dato.nextInt();
                
                System.out.print("Ingrese su sexo: ");
                sexo=dato.next().charAt(0);
                
                System.out.print("¿Es casado? ");
                casado=dato.nextBoolean();
                
                System.out.println("                         Ficha Personal");
                System.out.println("                         Nombre: "+nombre);
                System.out.println("                         Edad: "+edad);
                System.out.println("                         Sexo: "+sexo);
                System.out.println("                         Casado: "+casado);   
                dato.close();
      
    }
}