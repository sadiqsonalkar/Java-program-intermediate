import java.awt.*;
import java.awt.event.*;
 
class Calorie implements ActionListener
{
	Frame f=new Frame("CALORIE COUNTER");
	Label l1=new Label("PROTEIN");
	Label l2=new Label("CARBOHYDRATE");
	Label l3=new Label("FATS");
	Label l4=new Label("TOTAL ENERGY");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	
	Button b1=new Button("CALCULATE");
	Button b2=new Button("CLEAR");	
	
	Calorie()
	{
		l1.setBounds(50,100,130,20);
		l2.setBounds(50,140,130,20);
		l3.setBounds(50,180,130,20);
		l4.setBounds(50,220,130,20);

		
		t1.setBounds(200,100,130,20);
		t2.setBounds(200,140,130,20);
		t3.setBounds(200,180,130,20);
		t4.setBounds(200,220,130,20);
		
		b1.setBounds(50,260,100,20);
		b2.setBounds(200,260,100,20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int P=Integer.parseInt(t1.getText());
		int C=Integer.parseInt(t2.getText());
		int F=Integer.parseInt(t3.getText());
		
		
		if(e.getSource()==b1)
		{
			t4.setText(String.valueOf(4*P+4*C+9*F));
		}
		
		if(e.getSource()==b2)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
		}
		
		
	}
	
	public static void main(String args[])
	{
		new Calorie();
	}
}