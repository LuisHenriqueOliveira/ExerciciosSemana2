import javax.swing.JOptionPane;

public class MostrarData
{
	public static void main(String[] args) {
		int dia;
		int mes;
		int ano;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
		
		JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
	}
}
