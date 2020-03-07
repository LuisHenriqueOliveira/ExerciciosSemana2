import javax.swing.JOptionPane;

public class CriarPalavra
{
   public static void main(String[] args)
   {
      String letra1, letra2, letra3, letra4, letra5, letra6, letra7, letra8, letra9, letra10;
      
      JOptionPane.showMessageDialog(null,"Forme uma palavra com 10 letras");
      letra1 = JOptionPane.showInputDialog("Digite a primeira letra: "); 
      letra2 = JOptionPane.showInputDialog("Digite a segunda letra: ");
      letra3 = JOptionPane.showInputDialog("Digite a terceira letra: ");
      letra4 = JOptionPane.showInputDialog("Digite a quarta letra: ");
      letra5 = JOptionPane.showInputDialog("Digite a quinta letra: ");
      letra6 = JOptionPane.showInputDialog("Digite a sexta letra: ");
      letra7 = JOptionPane.showInputDialog("Digite a setima letra: ");
      letra8 = JOptionPane.showInputDialog("Digite a oitava letra: ");
      letra9 = JOptionPane.showInputDialog("Digite a nona letra: ");
      letra10 = JOptionPane.showInputDialog("Digite a decima letra: ");
      
      JOptionPane.showMessageDialog(null, letra1 + letra2 + letra3 + letra4 + letra5 + letra6 + letra7 + letra8 + letra9 + letra10);
      
   }
}