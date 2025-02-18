
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JessA
 */
public class resta {
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int x= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
  int y= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
  
  int resultado=x-y;
  
 JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
    }
    

}
