
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class calculator extends JFrame implements ActionListener {
	
    // Frame is for Presentation for the calculator that how the calculator will be showed.
	static JFrame f;
    // Text field  is where the calculations will be shown.
	static JTextField l;
    // s0- 1st value
    // s1- operator
    // s2- 2nd value
	String s0, s1, s2;

    // constructor of the class
	calculator()
	{
		s0 = s1 = s2 = "";
	}

    // main function contains all the code for the calculator.
	public static void main(String args[])
	{
		
        // object of frame
		f = new JFrame("calculator");
        
        // object of calculator class
		calculator c = new calculator();

		l = new JTextField(16);

        // buttons
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1; 
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		
		beq1 = new JButton("=");

		
		ba = new JButton("+");
		bs = new JButton("-");
		bd = new JButton("/");
		bm = new JButton("*");
		beq = new JButton("C");

		
		be = new JButton(".");

		JPanel p = new JPanel();

		
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);

		
		p.add(l);
		p.add(ba);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bs);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bm);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bd);
		p.add(be);
		p.add(b0);
		p.add(beq);
		p.add(beq1);

		f.add(p);

		f.setSize(200, 220);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{

        // s contains that value of button which user presses.
		String s = e.getActionCommand();

		// conditions checked if the "s" contains number or .
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			// if s1 i.e first number is already present in the text area then add the "s"in the s2 i.e second number.
			if (!s1.equals(""))
				s2 = s2 + s;
            // if s1 is not present then the "s" contains the first number and add it to s0.
			else
				s0 = s0 + s;


			// update the text area.
			l.setText(s0 + s1 + s2);
		}

        // if user enter clear button i.e "c"
		else if (s.charAt(0) == 'C') {
			s0 = s1 = s2 = "";
			l.setText(s0 + s1 + s2);
		}

        // if user enters "=" button then you have to perform calculations
		else if (s.charAt(0) == '=') {
            // te variable contains result.
			double te;

			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));

			// update the text area.
			l.setText(s0 + s1 + s2 + "=" + te);

			// convert s0 to string if user wants to perform calculations between more than two numbers .
			s0 = Double.toString(te);
            // clear the s1 and s2 in order to let the user enter the operator and the third number or so on.
			s1 = s2 = "";
		}
		else {

			// if there was no operator
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			// else calculate the result
			else {
				double te;
				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));

				
				s0 = Double.toString(te);

				s1 = s;
				s2 = "";
			}

			l.setText(s0 + s1 + s2);
		}
	}
}
