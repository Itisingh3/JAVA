import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.*;
    // import java.awt.event.*;
	class ColorCh extends JFrame implements ChangeListener
	{
		public static void main(String art[])
		{
			new ColorCh();
		}
		JSlider s1,s2,s3;
		JLabel l,l1;
		ColorCh()
		{
			Container cn=getContentPane();
			cn.setLayout(null);
			s1=new JSlider(0,255);
			s2=new JSlider(0,255);
			s3=new JSlider(0,255);

			s1.setBounds(100,150,400,100);
			
			s2.setBounds(100,280,400,100);
			
			s3.setBounds(100,410,400,100);
			cn.add(s1);
			cn.add(s2);
			cn.add(s3);
			l=new JLabel();
			l.setOpaque(true);
			l.setBounds(550,150,300,400);
			cn.add(l);  
            
            l1=new JLabel();
			l1.setBounds(100,520,200,60);
			cn.add(l1);
            s1.addChangeListener(this);
            s2.addChangeListener(this);
            s3.addChangeListener(this);
			setSize(900,750);
			setVisible(true);
		}
        public void stateChanged(ChangeEvent e){
            Color cl=new Color(s1.getValue(),s2.getValue(),s3.getValue());
		l1.setText(""+s1.getValue()+"  "+s2.getValue()+"  "+s3.getValue());
		l.setBackground(cl);
        }
	}