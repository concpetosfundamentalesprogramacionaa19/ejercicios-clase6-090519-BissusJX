/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        desarrollar una aplicacion que me permita ingresar placas de carros
         se asume que las placas ingresadas pertenecen a la region costa del 
         Ecuador en base a la placa nuestro programa determinara y presentara 
         la placa con la provincia a la que pertenece
        o oro m manabi r rios 
        */
        Scanner entrada = new Scanner (System.in);
        String placa = "";
        System.out.println("Ingrese la placa de su vehiculo");
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'o':
            case'O':
                System.out.printf("La placa pertenece al oro con la inicial "
                        + "%s de %s\n", 
                        valor, placa.toUpperCase());
                break;
            
            case 'm':
            case 'M':
                System.out.printf("La placa pertenece a Manabi con la inicial %s de %s\n ", 
                        valor, placa.toLowerCase());
                break;    
            case 'E':
            case 'e':
                 System.out.printf("La placa pertenece a Esmeraldas  con la inicial %s de %s\n", 
                          valor, placa.toLowerCase());
            case 'r':
            case 'R':
                System.out.printf("La placa pertenece a los Rios con la inicial %s de %s\n ", 
                        valor, placa.toLowerCase());
            case 'j':
            case 'J':
                  System.out.printf("La placa pertenece a Santo Domingo con la inicial %s de %s\n ", 
                        valor, placa.toLowerCase());
            case 'g':
            case 'G':
                System.out.printf("La placa pertenece a Manabi con la inicial %s de %s\n ", 
                        valor, placa.toLowerCase());
            case 'y':
            case 'Y':
                System.out.printf("La placa pertenece a Manabi con la inicial %s de %s\n ", 
                        valor, placa.toLowerCase());
            default:
                System.out.println("ninguna de las anteriores con la inicial %s de %s\n");
                
        }
        
    }
}
