/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 *
 * @author Gabriel
 */
public class Ejercicio1 
{

    public int sumaElementos(int x, int y)
    {
        /*Aquí vemos cual es el numero mayor para en base a eso calcular
          la máxima posición de la serie*/
        
        int mayor,menor;
        if (x>y) 
        {
            mayor=x;
            menor=y;
        }
        else if (y>x)
        {
            mayor=y;
            menor=x;
        }
        else
        {
            mayor=x;
            menor=y;
        }
        int vectorA[]=new int [mayor];
        
        int se=7;
        int se2=6;
        
        
        for (int i = 0; i <= mayor; i++) 
        {
            vectorA[i]=se;
            i=+1;
            vectorA[i]=se2;
            se=+2;
            se2=-2;
        }
               
        
        int suma;
        if (x<=0||x>255||y<=0||y>255)
        {
            return -1;
        }

        
        suma = vectorA[x]+vectorA[y];
         
        return suma;   
    }
        
}
