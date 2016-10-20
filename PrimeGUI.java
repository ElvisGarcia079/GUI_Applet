import java.awt.*;
//like that its going to import everything
import java.applet.*;
import java.awt.event.*;

public class PrimeGUI extends Applet implements ActionListener
{	//Create objects: DataType Identifier = new DataType(); Where the () is an object
	//The identifier now is what will represent the new unique object created
	TextField tf      =   new TextField();
	//"tf" will be what will represent a unique new TextField OBJECT
	Button    Prime   =   new Button("Check for Prime");
	//"Prime" will be what will represent a unique new Button OBJECT
	Label     primeLB =   new Label("Enter your number:");
	//"primeLB" will be what will represent a unique new Label OBJECT
	Label     result  =   new Label(); 
	//"result" will be what will represnet another unique new Label OBJECT
	
	// In the "init()" method, you set the layout, set the bounds, add components to the screen
	// implement ActionListner
	public void init()
	{	//set the layout
		setLayout(null);
		//set the bounds of the OBJECTS created in the class
		tf.setBounds(30, 40, 125, 25);
		Prime.setBounds(10, 90, 120, 25);
		primeLB.setBounds(10, 20, 120, 20);
		result.setBounds(30, 120, 150, 20);
		//add the OBJECTS to the screen with the bounds set up for them
		add(tf);
		add(Prime);
		add(primeLB);
		add(result);
		//I believe this is an example of adding the implemented ActionListener to the 
		//OBJECT represented by "Prime" and the argument is taking the value Prime from
		//"this" class, referring to the class we are in which is "PrimeGUI" 
		//In other words, the OBJECT "Prime" will be able to do whatever is defined in the 
		//ActionListener method
		Prime.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{	//This is where we define the interface "ActionListener". All interfaces have 
		//abstract methods that must be defined. When defined all OBJECTS that use the 
		//ActionListener will run this method.
		
		//This is an example of creating a variable. Variables allow us to assign a function
		//and store it inside a variable which will represent the function.
		//DataType Variable = Any function here will be assigned to the Variable
		//In this case, DataType = int, Variable = n, function = Integer.parseInt()
		//"n" has to be an integer, because that is its DataType
		int n = Integer.parseInt(tf.getText());
		//The function Interger.parseInt() takes in as an argument the OBJECT represented by 
		//"tf" and the function "getText()" will get text from the object referencing it
		//in this case "tf", so "tf.getText()" means that the "getText()" will get the text
		//from "tf"
		
		//Now we are checking the variable "n" which we assigned as the conversion to an 
		//integer of a string that we will get from the object "tf" which is a TextField.
		//the text in the TextField will be gotten by the "getText()" function
		if (n == 2) 		
		{	//This is where the OBJECT represented by "result" will be referenced when running 
			//the "setText()" function which will set the text in the argument.
			//in this case, the "result" object will write that the variable "n" is not prime. 
			//This is inside an IF statement, so it will only run this method if the variable 
			//"n" is divisible by two evenly.
			result.setText(n + " is a prime number");
		}
		else if (n % 2 == 0)
		{
			result.setText(n + " is not a prime number");
		}
		for (int i = 3; i <= Math.ceil(Math.sqrt(n)); i+=2)
		{
		    if (n%i == 0)
		    {
		    	result.setText(n + " is not a prime number");
		    }
		    else 
		    {
		    	result.setText(n + " is a prime number");
		    }
			
		}
	}
	

		    
		
}
	


