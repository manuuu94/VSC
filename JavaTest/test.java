package JavaTest;
import javax.swing.JOptionPane;

public class test {
	
	public static void main(String[] args) {
	test2 test2 = new test2();
	int prueba = Integer.parseInt(JOptionPane.showInputDialog(args));
	JOptionPane.showMessageDialog(null, test2.summation(prueba));			
		
	}
	

	
	
}
