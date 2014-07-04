/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.Scanner;

/*
 *
 * @author Gabriel
 */
public class Ejercicios 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        Ejercicio1 ejercicio1 = new Ejercicio1();
        System.out.print("Ingrese el valor de X: ");
        int A=entrada.nextInt();
        System.out.print("Ingrese el valor de Y: ");
        int B=entrada.nextInt();
        
        System.out.println("La suma de sus elementos es: "+ejercicio1.sumaElementos(A, B));
        
        
        
  
        
    }
    
}
