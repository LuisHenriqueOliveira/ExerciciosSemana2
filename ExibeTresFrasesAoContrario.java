import javax.swing.JOptionPane;

public class ExibeTresFrasesAoContrario
{
   public static void main(String[] args){
      String Palavra1;
      String Palavra2;
      String Palavra3;
      Palavra1=JOptionPane.showInputDialog("Digite a primeira palavra: ");
      Palavra2=JOptionPane.showInputDialog("Digite a primeira palavra: ");
      Palavra3=JOptionPane.showInputDialog("Digite a primeira palavra: ");
      //processamento
      String resultado = Palavra3 + " " + Palavra2 + " " + Palavra1;
      //Saida
      JOptionPane.showMessageDialog(null,resultado);
      
     // Feito por mim("Simplificado"): JOptionPane.showMessageDialog(null,Palavra3+" "+ Palavra2 + " " + Palavra1);
   }
}