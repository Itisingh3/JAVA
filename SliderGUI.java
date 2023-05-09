import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
public class SliderGUI extends JFrame implements ChangeListener
{
	

	public static void main(String art[])
	{
		new SliderGUI();
	}
	JSlider s1,s2,s3;
	JLabel l,l1;
	public SliderGUI()
	{
		Container cn=getContentPane();
		cn.setLayout(null);
		s1=new JSlider(0,255);
		s2=new JSlider(JSlider.VERTICAL,0,255,0);
		
		s1.setBounds(40,40,300,30);
		s2.setBounds(40,80,30,300);
		
		s1.addChangeListener(this);
		s2.addChangeListener(this);
		cn.add(s1);  	
		cn.add(s2);
		l=new JLabel();
		l.setOpaque(true);
		l.setBounds(80,70,300,300);
		
		l.setBackground(Color.green);
		cn.add(l);
		setSize(700,500);
		setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) 
	{
		l.setBackground(Color.blue);
		l.setBounds(80+s1.getValue(),70+s2.getValue(),300,300);
	}

}