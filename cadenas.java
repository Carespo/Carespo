/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioniq;

import java.util.StringTokenizer;

/**
 *
 * @author cares
 */
public class cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena ="Hola a todos";
        cadena=cadena.replace('o','p');
        System.out.println("La nueva cadena es "+cadena);
        cadena ="Hola a todos";
        cadena= " "+cadena+" ";
        System.out.println(cadena);
        cadena = cadena.trim();
        System.out.println("La longitud de la cadena es "+cadena.length()+cadena);
        String linea="amarillo azul# rojo verde#";
        System.out.println("Una subcadena "+linea.substring(0, 4)); 
}
    
}
