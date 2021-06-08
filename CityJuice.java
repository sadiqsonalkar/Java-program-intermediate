import java.awt.*;
import java.awt.event.*;

class CityJuice
extends Frame
implements ActionListener
{
	Frame f=new Frame("CITY JUICE CENTRE");
	Label l1=new Label("MENU");
	Label l2=new Label("DISCOUNT");
	Label l3=new Label("TOTAL COST : ");
	Label l4=new Label("DISCOUNT : ");
	Label l5=new Label("NET PAYABLE AMOUNT : ");
	
	Button b1=new Button("CALCULATE");
	Button b2=new Button("CLEAR");
	
	Checkbox c1=new Checkbox("Orange Juice = 100");
	Checkbox c2=new Checkbox("Coco Chrunch = 150");
	Checkbox c3=new Checkbox("Apple Milkshake =	170");
	Checkbox c4=new Checkbox("Without Ice 	  =	15");
	
	CheckboxGroup discount=new CheckboxGroup();
	Checkbox r1=new Checkbox("None",discount,true);
	Checkbox r2=new Checkbox("5%",discount,false);
	Checkbox r3=new Checkbox("10%",discount,false);
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	


	CityJuice()
	{
		l1.setBounds(70,50,100,20);
		l2.setBounds(300,50,100,20);
		l3.setBounds(50,350,170,20);
		l4.setBounds(50,400,170,20);
		l5.setBounds(50,450,170,20);
		
		c1.setBounds(50,100,250,20);
		c2.setBounds(50,150,250,20);
		c3.setBounds(50,200,250,20);
		c4.setBounds(50,250,250,20);
		
		r1.setBounds(300,100,100,20);
		r2.setBounds(300,150,100,20);
		r3.setBounds(300,200,100,20);
		
		b1.setBounds(100,300,100,20);
		b2.setBounds(250,300,100,20);
		
		t1.setBounds(230,350,200,20);
		t2.setBounds(230,400,200,20);
		t3.setBounds(230,450,200,20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		
		f.add(r1);
		f.add(r2);
		f.add(r3);
		
		f.add(b1);
		f.add(b2);
		
		f.add(t1);
		f.add(t2);
		f.add(t3); 
		
		b1.addActionListener((ActionListener)this);
		b2.addActionListener((ActionListener)this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		double r=0.0;
		double d=0.0;
		double ta=0.0;
		if (e.getSource()==b1)
		{
			if (c1.getState())
			{
				r=r+100;
				ta=r;
			}
			if (c2.getState())
			{
				r=r+150;
				ta=r;
			}
			if (c3.getState())
			{
				r=r+170;
				ta=r;
			}
			if (c4.getState())
			{
				ta=r+15;
			}
			t1.setText(""+ta);
			if (discount.getSelectedCheckbox()==r1)
			{
				d=0.0;
			}
			if (discount.getSelectedCheckbox()==r2)
			{
				d=r*0.05;
			}
			if (discount.getSelectedCheckbox()==r3)
			{
				d=r*0.1;
			}
			t2.setText(""+d);

			t3.setText(""+(ta-d));
		
		}
		if(e.getSource()==b2)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			c1.setState(false);
			c2.setState(false);
			c3.setState(false);
			c4.setState(false);
			Checkbox r1=new Checkbox("None",discount,true);
		}
		
		
	}
	
	
	public static void main(String args[])
	{
		new CityJuice();
	}
}