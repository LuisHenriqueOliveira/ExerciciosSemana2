import javax.swing.JOptionPane;

public class MostrarSeuPeso
{
   public static void main(String[] args)
   {
      double peso;
    
      peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso: "));
       
      JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + "kg.");  
   }
}