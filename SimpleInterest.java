import java.awt.*;
import java.awt.event.*;
 
class SimpleInterest implements ActionListener
{
	Frame f=new Frame("SIMPLE INTEREST CALCULATOR");
	Label l1=new Label("PRINCIPLE");
	Label l2=new Label("RATE OF INTEREST");
	Label l3=new Label("PERIOD (no. of yrs)");
	Label l4=new Label("SIMPLE INTEREST");
	Label l5=new Label("TOTAL AMOUNT");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	
	Button b1=new Button("CALCULATE");
	Button b2=new Button("CLEAR");	
	
	SimpleInterest()
	{
		l1.setBounds(50,100,130,20);
		l2.setBounds(50,140,130,20);

		l3.setBounds(50,180,130,20);
		l4.setBounds(50,260,130,20);
		l5.setBounds(50,300,130,20);
		
		t1.setBounds(200,100,130,20);
		t2.setBounds(200,140,130,20);
		t3.setBounds(200,180,130,20);
		t4.setBounds(200,260,130,20);
		t5.setBounds(200,300,130,20);
		
		b1.setBounds(50,220,100,20);
		b2.setBounds(200,220,100,20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		
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
		int R=Integer.parseInt(t2.getText());
		int N=Integer.parseInt(t3.getText());
		
		
		if(e.getSource()==b1)
		{
			t4.setText(String.valueOf((P*R*N)/100));
			t5.setText(String.valueOf(P*R*N/100+P));
		}
		
		if(e.getSource()==b2)
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
		}
		
		
	}
	
	public static void main(String args[])
	{
		new SimpleInterest();
	}
}