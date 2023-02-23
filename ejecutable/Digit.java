import javax.swing.JOptionPane;


public class Digit
{
    public static void main(String[] args)
    {
        // Declaración de variables
        
        int a;
        // Entrada
        JOptionPane.showMessageDialog(null, "Numero - Letras");
        a= Integer.parseInt(JOptionPane.showInputDialog(null, "Digita un numero de 1 digito: "));    

        // Procesamiento
        
        {
            if(a==0)
                // Suma
                JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: c-e-r-o");
                
            if(a==1)
                // Suma
                JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: u-n-o");
                
            if(a==2)
                JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: d-o-s");
                
            if(a==3)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: t-r-e-s");
                
            if(a==4)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: c-u-a-t-r-o");
                
            if(a==5)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: c-i-n-c-o");
                
            if(a==6)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: s-e-i-s");
                
            if(a==7)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: s-i-e-t-e");
                
            if(a==8)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: o-c-h-o");
                
            if(a==9)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste se escribe de esta manera: n-u-e-v-e");
                
            if(a>9)
            JOptionPane.showMessageDialog(null, "el numero que dijitaste tiene mas de un digito");
            

        }

        // Salida

        // Fin
        System.exit(0);
    }
}