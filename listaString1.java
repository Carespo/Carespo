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
public class listaString1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] peliculas=new String[5];
        for(int i=0;i<peliculas.length;i++){
            peliculas[i]=JOptionPane.showInputDialog(null, "Nombre de la pelicula");
           }
        buscarPelicula(peliculas,1);
    }
    public static void buscarPelicula(String[] lista, int i)
    {
    String nombre=lista[i];
    System.out.println("Nombre de la pelicula  "+ nombre);
    }
    
}
