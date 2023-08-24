package programacioniq;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cares
 */
public class contieneinstancia {
        public Integer Entrada (String msg)
    {
   	int  a;
       /* a=Double.parseDouble(JOptionPane.showInputDialog(null,msg));
      return a; */
         	
         Integer aa;
        aa=Integer.parseInt(JOptionPane.showInputDialog(null,msg));
        return aa; 
        
    }
    
    public double calcular (double P, double Q, double j)
    {	double c;
   		c=(P+Q+j)/3;
    	return c;
    		
    }	
    
    public void salida (double msg)
    {
   		JOptionPane.showMessageDialog(null," EL RESULTADO ES " + msg);	
    }

}
