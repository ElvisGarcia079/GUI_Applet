import java.applet.*; // This is in order to extend the Applet Class
import java.awt.*; // This is what allows us to create objects of TextFields, Buttons etc
import java.awt.event.*; // This allows us to implement the ActionListener 

public class Add extends Applet implements ActionListener
{
	TextField firstField   = new TextField();
	TextField secondField  = new TextField();
	Label     firstLabel   = new Label("Enter your first number below:");
	Label     secondLabel  = new Label("Enter your second number below:");
	Label     thirdLabel   = new Label();
	Button    firstButton  = new Button("Find the Sum");
	

	
	public void init()
	{
		setLayout(null);
		firstField.setBounds(10, 30, 50, 20);
		secondField.setBounds(10, 70 , 50, 20);
		firstLabel.setBounds(10, 10, 175, 20);
		secondLabel.setBounds(10, 50, 200, 20);
		thirdLabel.setBounds(10, 150, 150, 20);
		firstButton.setBounds(10, 100, 100, 20);
		add(firstField);
		add(secondField);
		add(firstLabel);
		add(secondLabel);
		add(thirdLabel);
		add(firstButton);
		firstButton.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int p = Integer.parseInt(firstField.getText());
		int q = Integer.parseInt(secondField.getText());
		int sum = p + q;
		
		
		
		if (firstButton != null)
		{
				thirdLabel.setText("Your sum is " + sum);
		}
		
		
		
	}
	
	
}
