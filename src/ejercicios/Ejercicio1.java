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
        
        int mayor;
        if (x<y) 
        {
            mayor=y;
        }
        else if (x>y)
        {
            mayor=x;
        }
        else
        {
            mayor=x;
        }
        int vectorA[]=new int [mayor];
        
        int con=7;
        int con2=6;
        for(int i=0;i<mayor;i++)
        {
            
            vectorA[i]=con;
            i=i+1;
            vectorA[i]=con2;
            con=con+1;
            con2=con2-2;
        }
        int suma;
        if (x<=0||x>255||y<=0||y>255)
        {
            return -1;
        }
        int posicionX=x-1;
        int posicionY=y-1;
        
        suma = vectorA[posicionX]+vectorA[posicionY];
             
        
            
         return suma;   
    }
        
}
