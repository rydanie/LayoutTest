//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.Color;
//import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LayoutTest extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1;
	private JPanel mainPanel;
	private JPanel buttonPane;
	private JLabel outputLabel;
	private JLabel label;
	
	public LayoutTest(){
		
		
		
		//Always call this first when extending a class
		super("Test Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JButton button;
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		label = new JLabel("Here what want");
		outputLabel = new JLabel();
		mainPanel.add(outputLabel);
		mainPanel.add(label);

		buttonPane = new JPanel();
		buttonPane.setLayout(new GridLayout(1,3));
		
		button = new JButton("One");
		button.setActionCommand("one");
		button.addActionListener(this);
		buttonPane.add(button);
		
		button = new JButton("Two");
		button.setActionCommand("two");
		button.addActionListener(this);
		buttonPane.add(button);
		
		button = new JButton("Three");
		button.setActionCommand("three");
		button.addActionListener(this);
		buttonPane.add(button);
		
		
		
		add( buttonPane, BorderLayout.SOUTH);
		
		mainPanel.setLayout(new FlowLayout());
		
		add(mainPanel, BorderLayout.CENTER);
		
		
		
		setSize( getPreferredSize());
		pack();
		setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		JButton button = (JButton)e.getSource();
		
		switch( button.getActionCommand()){
		
		case ("one"):
			outputLabel.setText("One");
		break;
		
		case ("two"):
			outputLabel.setText("Two");
		break;
		
		case ("three"):
			outputLabel.setText("Three");
		break;
		
		default:
			JOptionPane.showMessageDialog(this,  "Unknown");
			break;
			
		//urtyriuoetyiu
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JFrame f = new JFrame("LayoutTest");
		
		new LayoutTest();
		

		
	}

}
