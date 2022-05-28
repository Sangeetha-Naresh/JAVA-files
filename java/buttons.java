/*Java Program to Create Two Radio Buttons and Get the Label of Button Selected*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Radio_Button implements ActionListener
{
	static JRadioButton yes;
	static JRadioButton no;
	static JTextField text;
	//Driver function
	public static void main(String args[])
	{
		//Create a frame
		JFrame frame=new JFrame("Radio Button");
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Create a text field
		text=new JTextField();
		text.setBounds(0,0,500,50);
		frame.add(text);
		//Create two radio buttons
		yes=new JRadioButton("Yes");
        no=new JRadioButton("No");
		yes.setBounds(210,100,80,60);
		no.setBounds(210,200,80,60);
		frame.add(yes);
		frame.add(no);
		//Create an object of the class
		Radio_Button obj=new Radio_Button();
		//Associate ActionListener with the radio buttons
		yes.addActionListener(obj);
		no.addActionListener(obj);
		//Display the frame
		frame.setVisible(true);
	}
	//function to display the label of button selected
	public void actionPerformed(ActionEvent e)
	{
		String b=e.getActionCommand();		
		if(b.equals("Yes"))
		{
			if(no.isSelected())
				no.setSelected(false);
		}
		else
		{
			if(yes.isSelected())
            yes.setSelected(false);
		}
		text.setText("Label of Button Selected : "+b);
	}
}