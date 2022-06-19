import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	
	boolean isoperatorClicked=false;
	
	JFrame jf;
	JLabel displayLabel;
	
	JButton sevenButton,nineButton,eightButton,sixButton,fiveButton,brackLButton,brackRButton;
	JButton fourButton,threeButton,twoButton,oneButton,zeroButton,deletebutton;
	JButton pointButton,plusButton,mulButton,minusButton,clearButton,equalButton,divButton;
	
	String oldValue;
	int flag;
	float result;
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(357,515);
		jf.setLocation(300, 150);
		
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(10, 50, 320, 80);
		displayLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		
		
		
		 
		sevenButton=new JButton("7");
		sevenButton.setBounds(5, 255, 80, 50);
		sevenButton.addActionListener(this);
		
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sevenButton);
		
		
		
		eightButton=new JButton("8");
		eightButton.setBounds(90, 255, 80, 50);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		
		
		
		
		nineButton=new JButton("9");
		nineButton.setBounds(175, 255, 80, 50);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(05, 310, 80, 50);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		
		
		
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(90, 310, 80, 50);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		
		
		
		sixButton=new JButton("6");
		sixButton.setBounds(175, 310, 80, 50);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		
		
		
		threeButton=new JButton("3");
		threeButton.setBounds(175, 365, 80, 50);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		
		
		
		twoButton=new JButton("2");
		twoButton.setBounds(90, 365, 80, 50);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		
		
		
		
		oneButton=new JButton("1");
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		oneButton.setBounds(5, 365, 80, 50);
		
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		
		
		
		
		pointButton=new JButton(".");
		pointButton.setFont(new Font("Arial",Font.PLAIN,40));
		pointButton.setBounds(05, 420, 80, 50);
		
		pointButton.addActionListener(this);
		jf.add(pointButton);
		
		
		
		
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(90, 420, 80, 50);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		
		
		
		
		
		equalButton=new JButton("=");
		equalButton.setBounds(175, 420, 80, 50);
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		
		
		
		plusButton=new JButton("+");
		plusButton.setBounds(175, 200, 80, 50);
		plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		
		
		
		
		minusButton=new JButton("-");
		minusButton.setBounds(260, 200, 80, 50);
		minusButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		
		
		
		
		
		mulButton=new JButton("×");
		mulButton.setBounds(260, 255, 80, 50);
		mulButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		
		brackLButton=new JButton("(");
		brackLButton.setBounds(260, 310, 80, 50);
		brackLButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		brackLButton.addActionListener(this);
		jf.add(brackLButton);
		
		brackRButton=new JButton(")");
		brackRButton.setBounds(260, 365, 80, 50);
		brackRButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		brackRButton.addActionListener(this);
		jf.add(brackRButton);
		
		
		
		
		divButton=new JButton("÷");
		divButton.setBounds(90, 200, 80, 50);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		
		divButton.addActionListener(this);
		jf.add(divButton);
		
		
		
		
		
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(260, 420, 80, 50);
		clearButton.setFont(new Font("Arial",Font.BOLD,10));
		
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		
		deletebutton=new JButton("DELETE");
		deletebutton.setBounds(5, 200, 80, 50);
		deletebutton.setFont(new Font("Arial",Font.BOLD,10));
		jf.add(deletebutton);
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	    new Calculator();
	}



@Override
public void actionPerformed(ActionEvent e) {
	

	       if(e.getSource()==sevenButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("7");
	    		   isoperatorClicked=false;
	    		   
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"7");
	    	   }
	    	  
	    	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==eightButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("8");
	    		   isoperatorClicked=false;
	    	  
	    	   }else {
	    	   
	    	   displayLabel.setText(displayLabel.getText()+"8");
	         
	    	   }
	    	   
	       
	       }else if(e.getSource()==nineButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("9");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"9");
	    	   }
	    	   
	    	   
	       
	    	   
	       }else if(e.getSource()==sixButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("6");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"6");
	    	   }
	    	   
	    	   
	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==fourButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("4");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"4");
	    	   }
	    	   
	    	   
	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==fiveButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("5");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"5");
	    	   }
	    	   
	    	   
	    	
	    	   
	    	   
	    	   
	       }else if(e.getSource()==threeButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("3");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"3");
	    	   } 
	    	   
	    	   
	    	   
	    	   
	    	     
	    	   
	    	   
	       }else if(e.getSource()==twoButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("2");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"2");
	    	   }
	    	   
	    	   

	    	   
	    	   
	    	   
	       }else if(e.getSource()==oneButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("1");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"1");
	    	   }
	    	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==zeroButton) {
	    	   if(isoperatorClicked) {
	    		   displayLabel.setText("0");
	    		   isoperatorClicked=false;
	    	   }else {
	    		   displayLabel.setText(displayLabel.getText()+"0");
	    	   }
	    	   
	    	   
	    	  
	       }else if(e.getSource()==pointButton) {
             if(isoperatorClicked) {
            	 displayLabel.setText(".");
            	 isoperatorClicked=false;
            	 
             }else {
            	 displayLabel.setText(displayLabel.getText()+".");
             }
	    	 
	    	   
	    	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==plusButton) {
	    	   isoperatorClicked=true;
	    	  
	    	   oldValue=displayLabel.getText();
	    	   displayLabel.setText(displayLabel.getText()+"+");
	    	   
	    	   flag=1;
	    	   
	    	   
	    	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==minusButton) {
	    	   isoperatorClicked=true;
	    	   
	    	   oldValue=displayLabel.getText();
	    	   displayLabel.setText(displayLabel.getText()+"-");
	    	   flag=2;
	    	   
	    	   
	    	   
	    	   
	       }else if(e.getSource()==mulButton) {
	    	   isoperatorClicked=true;
	    	   
	    	  
	    	   oldValue=displayLabel.getText();
	    	   displayLabel.setText(displayLabel.getText()+"×");
	    	   flag=3;
	    	   
	    	   
	       }else if(e.getSource()==divButton) {
	    	   isoperatorClicked=true;
	    	   
	    	   oldValue=displayLabel.getText();
	    	   displayLabel.setText(displayLabel.getText()+"÷");
	    	   flag=4;
	    	   
	    	   
	    	   
	       }else if(e.getSource()==clearButton) {
	    	   displayLabel.setText("");
	    	   
	    	   
	    	   
	 
	    	   
	       }else if(e.getSource()==equalButton) {
	    	   
	    	   String newValue=displayLabel.getText();
	    	   
	    	   float oldValuef=Float.parseFloat(oldValue);
	    	   float newValueF=Float.parseFloat(newValue);
	    	   
	    	   
	       


                   
	       
	             if(flag==1) {
	               float result=oldValuef+newValueF;
	  	    	   displayLabel.setText(result+"");
	  	    	   
	  	    	   
	             }else if(flag==2) {
	            	 float result=oldValuef-newValueF;
	  	    	   displayLabel.setText(result+"");
	  	    	   
	  	    	   
	             }else if(flag==3) {
	            	 float result=oldValuef*newValueF;
	  	    	   displayLabel.setText(result+"");
	  	    	   
	  	    	   
	             }else if(flag==4) {
	            	 float result=oldValuef/newValueF;
	  	    	   displayLabel.setText(result+"");
	  	    	   
	             }

	       }
	
         }
}
