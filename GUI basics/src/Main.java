import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hi " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
				
		JOptionPane.showMessageDialog(null, "Your age is " + age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		
		JOptionPane.showMessageDialog(null, "Your height is " + height);
	}

}
