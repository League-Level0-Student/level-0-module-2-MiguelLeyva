import javax.swing.JOptionPane;

public class rollercoaster {

	public static void main(String[] args) {
		 
		String h = JOptionPane.showInputDialog("How tall are you?(Inches)");
		int height = Integer.parseInt(h);
		if(height > 48) {
			JOptionPane.showConfirmDialog(null, "You can go on the Roller Coaster");
		}
		else {
			JOptionPane.showConfirmDialog(null, "You need to grow first");
		}
		
	}
	
}
