import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        // Mostrar menú de opciones
        int x=0,y=0;
        String opcion = JOptionPane.showInputDialog(
            "Seleccione una operación:\n" +
            "1. Suma\n" +
            "2. Resta\n" +
            "3. Multiplicación\n" +
            "4. División"
        );
        int opcionSeleccionada = Integer.parseInt(opcion);
        int resultado = 0;
        boolean operacionValida = true;

        switch (opcionSeleccionada) {
            case 1: // Suma
            x= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
            y= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
           
           resultado = x + y ;
           
          JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                break;
            case 2: // Resta
             x= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
             y= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
            
            resultado = x - y ;
            
           JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                break;
            case 3: // Multiplicación
             x= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
             y= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
            
            resultado = x * y ;
            
           JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                break;
            case 4: // División
            x= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
            y= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
                if (x != 0) {
                   
                   resultado = y / x ;
                   
                  JOptionPane.showMessageDialog(null,"El resultado es: "+resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
                    operacionValida = false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                operacionValida = false;
        }
    }
}
