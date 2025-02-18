package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args) {
        Suma x = new Suma();
        
        float a,b;
        String resultado;
        a=(float) Double.parseDouble(JOptionPane.showInputDialog("Escribe el numero 1:"));
        b=(float) Double.parseDouble(JOptionPane.showInputDialog("Escribe el numero 1:"));        
        
        JOptionPane.showMessageDialog(null, "El resultado de "+a+" + "+b+" = "+x.sumar(a, b));
               
    }

    
}
