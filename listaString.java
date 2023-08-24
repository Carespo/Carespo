/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioniq;

import javax.swing.JOptionPane;

/**
 *
 * @author cares
 */
public class listaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] peliculas=new String[]{"Uno", "Dos", "Tres"}; 
        //String [] peliculas=new String[5];
       // int op=0;
       String cadena;
        buscarPelicula(peliculas,1);
        buscarPelicula1(peliculas,"Uno");
        borrarPelicula1(peliculas,"Dos");
        recorrer(peliculas);

}
        
        //buscarPelicula(peliculas,1);
        //buscarPelicula1(peliculas,"Buscando a Nemo");
        //borrarPelicula1(peliculas,"Buscando a Nemo");
        //recorrer(peliculas);
    
    public static void buscarPelicula(String[] lista, int i)
    {
        
        if(i<lista.length){// si el  elemento recibido es menor
            
            String nombre=lista[i];
            System.out.println("Nombre de la pelicula  "+ nombre);
        }else{
            System.out.println("el indice no existe la pelicula  ");
        }
        
    }
    public static void buscarPelicula1(String[] lista, String cadena)
    {
        int ban=0;
         //for(int i=0;i<lista.length;i++)
            for(int i=0;i<lista.length;i++)
            {
                if(lista[i]==cadena){
                                System.out.println("La pelicula está disponible ");
                                i=lista.length;
                                ban=1;
                    }
            }
            if (ban==0)
                                System.out.println("La pelicula no está disponible ");
                
    }
    public static void borrarPelicula1(String[] lista, String cadena)
    {
        int ban=0;
            for(int i=0;i<lista.length;i++)
            {
                if(lista[i]==cadena){
                                System.out.println("La pelicula está disponible ");
                                ban=1;
                                lista[i]="";
                                i=lista.length;
                                System.out.println("La pelicula fue borrada");
                    }
            }
            if (ban==0)
                                System.out.println("La pelicula no está disponible ");
                
    }
public static void recorrer(String[] lista)
{
   for(int i=0;i<lista.length;i++)
   {
       System.out.println(lista[i]);
   }
}

}