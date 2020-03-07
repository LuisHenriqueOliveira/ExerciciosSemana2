import javax.swing.JOptionPane;

public class MilharCentenaDezenaUnidade
{
   public static void main(String[] args)
   {
      byte n1; 
      byte n2;
      byte n3;
      byte n4;
      
      n1 = Byte.parseByte(JOptionPane.showInputDialog("Digite o primeiro numero"));
      n2 = Byte.parseByte(JOptionPane.showInputDialog("Digite o segundo numero"));
      n3 = Byte.parseByte(JOptionPane.showInputDialog("Digite o terceiro numero"));
      n4 = Byte.parseByte(JOptionPane.showInputDialog("Digite o quarto numero"));
      String resultado = n1 + "" + n2 + n3 + n4;
      JOptionPane.showMessageDialog(null,resultado);
   }
}