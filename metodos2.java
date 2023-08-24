package programacioniq;
import javax.swing.*;/**
/**
 * @(#)SUMA_CON_METODO.java
 *
 *
 * @author 
 * @version 1.00 2010/10/19
 */

public class metodos2 {
        
    
    /**
     * Creates a new instance of <code>SUMA_CON_METODO</code>.
     */
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        contieneinstancia union;//instancio a la clase Enlaces por medio de la variable union
        union=new contieneinstancia();//creo el obejo para llamar los métodos de la clase Enlaces
    double X,Y,Z=0,K;
         X=union.Entrada ("INGRESE nota 1");  //guarde en X el valor que returne del metodo entrada, y envie el mensage 
         Y=union.Entrada ("INGRESE nota 2");
         K=union.Entrada ("INGRESE nota 3");
         Z=union.calcular(X,Y,K);
         union.salida (Z);		  
    }
          
    static Integer Entrada (String msg)
    {
   	int  a;
       /* a=Double.parseDouble(JOptionPane.showInputDialog(null,msg));
      return a; */
         double x=2.0;
         Integer aa;
        aa=Integer.parseInt(JOptionPane.showInputDialog(null,msg));
        salida(aa);
        return aa; 
        
    }
    
    static double calcular (double P, double Q, double j)
    {	double c;
   		c=(P+Q+j)/3;
    	return c;
    		
    }	
    
    static void salida (int msg)
    {
   		JOptionPane.showMessageDialog(null," EL RESULTADO ES " + msg);	
    }
        	
}