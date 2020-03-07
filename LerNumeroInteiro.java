import javax.swing.*;

public class LerNumeroInteiro
{
   public static void main(String[] args)
   {
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
      JOptionPane.showMessageDialog(null,"O valor do número digitado é: "+ numero);
   }
}