import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


public class View extends JFrame implements ActionListener{
	
	 JPanel contentPane=  new JPanel();
	 JPanel togglePane =new JPanel();
	 JPanel finalresult = new JPanel();
	 int first;
	Vector<Integer> V1 = new Vector();
	boolean track = true;
	
	 View(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize( 600, 600);
		
		
		finalresult.setLayout(null);
		contentPane.setLayout(null);
		togglePane.setLayout(null);
		setContentPane(togglePane);
		
		finalresult.add(finalwin);
		finalwin.setOpaque(true);
		finalwin.setBounds(50,10,200,30);
		finalwin.setBackground(Color.blue);
		finalwin.setForeground(Color.red);
		finalwin.setText("test");
		
		finalresult.add(Exitlast);
		Exitlast.setBounds(30,100,80,50);
		
		
		
			
		finalwin.add(testbutton);
		testbutton.setBounds(20,60,50,50);
		
		
		togglePane.add(txttoggle3);
		txttoggle3.setOpaque(true);
		txttoggle3.setBounds(20, 20,350 ,30);
		txttoggle3.setBackground(Color.blue);
		txttoggle3.setForeground(Color.red);
		txttoggle3.setText("Get the lucky number");
		
		togglePane.add(txttoggle1);
		txttoggle1.setOpaque(true);
		txttoggle1.setBounds(20, 50,350 ,30);
		txttoggle1.setBackground(Color.blue);
		txttoggle1.setForeground(Color.red);
		txttoggle1.setText("the player gets the lucky number first will win\r\n");
		
		togglePane.add(txttoggle2);
		txttoggle2.setOpaque(true);
		txttoggle2.setBounds(20, 80,350 ,30);
		txttoggle2.setBackground(Color.blue);
		txttoggle2.setForeground(Color.red);
		txttoggle2.setText("want to play? press the button");
		
		togglePane.add(Exit);
		Exit.setBounds(190,150,90,30);
		
		
		togglePane.add(textButton);
		textButton.setBounds(20,150,150,30);
		
	
		
		contentPane.add(txt);
		txt.setBounds(350, 0, 120, 100);
		
		contentPane.add(turn);
		turn.setOpaque(true);
		turn.setBounds(350,120,120 ,100);
		turn.setBackground(Color.blue);
		turn.setForeground(Color.red);
		turn.setText("Player1 turn");
		
		one.setBounds(0, 0, 70, 60);
		contentPane.add(one);
		
				 
		two.setBounds(0, 60, 70, 60);
		contentPane.add(two);
		
		
		three.setBounds(0,120, 70, 60);
		contentPane.add(three);
		
		
		four.setBounds(0,180, 70, 60);
		contentPane.add(four);
		
		
		five.setBounds(70,0, 70, 60);
		contentPane.add(five);
		
		
		six.setBounds(70,60,70, 60);
		contentPane.add(six);
	
		
		seven.setBounds(70,120, 70, 60);
		contentPane.add(seven);
		
		
		eight.setBounds(70,180, 70, 60);
		contentPane.add(eight);
		
		
		nine.setBounds(140, 0, 70, 60);
		contentPane.add(nine);
		
		
		ten.setBounds(140, 60, 70, 60);
		contentPane.add(ten);
		
		
		eleven.setBounds(140,120, 70, 60);
		contentPane.add(eleven);
	
		
		twelve.setBounds(140, 180, 70, 60);
		contentPane.add(twelve);
		
		
		thirteen.setBounds(210,0, 70, 60);
		contentPane.add(thirteen);
		
		
		fourteen.setBounds(210, 60, 70, 60);
		contentPane.add(fourteen);
	
		
		fifteen.setBounds(210,120,70, 60);
		contentPane.add(fifteen);
		
		
		sixteen.setBounds(210,180, 70, 60);
		contentPane.add(sixteen);
		
		
		seventeen.setBounds(280 , 0, 70, 60);
		contentPane.add(seventeen);
		
		
		eighteen.setBounds(280, 60, 70, 60);
		contentPane.add(eighteen);
		
		
		nineteen.setBounds(280, 120, 70, 60);
		
		
		
		twenty.setBounds(280,180, 70, 60);
		contentPane.add(twenty);
		
	}
	
	
	
	 JButton one = new JButton("click ");
	 JButton two = new JButton("click ");
	 JButton three = new JButton("click");
	 JButton four = new JButton("click");
	 JButton five = new JButton("click");
	 JButton six = new JButton("click");
	 JButton seven = new JButton("click");
	 JButton eight = new JButton("click");
	 JButton nine = new JButton("click");
	 JButton ten = new JButton("click");
	 JButton eleven = new JButton("click");
	 JButton twelve = new JButton("click");
	 JButton thirteen = new JButton("click");
	 JButton fourteen = new JButton("click");
	 JButton fifteen = new JButton("click");
	 JButton sixteen = new JButton("click");
	 JButton seventeen = new JButton("click");
	 JButton eighteen = new JButton("click");
	 JButton nineteen = new JButton("click");
	 JButton twenty = new JButton("click");
	 JButton textButton = new JButton("click to play");
	 JButton testbutton = new JButton("click");
	 JButton Exit = new JButton("Exit");
	 JButton Exitlast = new JButton("Exit");
	 JButton playagain = new JButton("playagain");
	 TextField txt=new TextField();
	 
	 JLabel txttoggle1=new JLabel();
	 JLabel txttoggle2=new JLabel();
	 JLabel txttoggle3=new JLabel();
	 JLabel turn =new JLabel();
	 JLabel finalwin =new JLabel();
	 
	 
	 void clicklistner(ActionListener listnerClick){
		 
		 one.addActionListener(listnerClick);
		 two.addActionListener(listnerClick);
		 three.addActionListener(listnerClick);
		 four.addActionListener(listnerClick);
		 five.addActionListener(listnerClick);
		 six.addActionListener(listnerClick);
		seven.addActionListener(listnerClick);
		eight.addActionListener(listnerClick);
		nine.addActionListener(listnerClick);
		ten.addActionListener(listnerClick);
		eleven.addActionListener(listnerClick);
		twelve.addActionListener(listnerClick);
		thirteen.addActionListener(listnerClick);
		fourteen.addActionListener(listnerClick);
		fifteen.addActionListener(listnerClick);
		sixteen.addActionListener(listnerClick);
		seventeen.addActionListener(listnerClick);
		eighteen.addActionListener(listnerClick);
		nineteen.addActionListener(listnerClick);
		twenty.addActionListener(listnerClick);
		Exitlast.addActionListener(listnerClick);

		Exit.addActionListener(listnerClick);
		textButton.addActionListener(listnerClick);
	 }
	

	 void setLuckyval(int lucky){
		 first = lucky;
			
			txt.setText("your lucky no is:"+ lucky);
		}
	
	 void setButtonval(Vector V){
		 
	 V1 = V;
	}
	 
	 
	 public void actionPerformed(ActionEvent e) {
	 
	 if(e.getSource()==textButton){
		 togglePane.setVisible(false);
		 setContentPane(contentPane);
	 }
	
	 if(e.getSource()==Exitlast){
		 System.exit(0);
	 }
	 
	 if(e.getSource()==Exit){
		 System.exit(0);
	 }
	
	 else if(e.getSource()==one) {
		    String S1 =	String.valueOf(V1.get(0));
		        one.setText(S1);
		          if(V1.get(0)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
		   if(track==true){
			   turn.setText("Player two turn");
			   track = false;}
		   else{  turn.setText("Player one turn");
			   track =true;}
	 }
	 else if(e.getSource()==two) {
		    	String S1 =	String.valueOf(V1.get(1));
		           two.setText(S1);
		           if(V1.get(1)==first){
			        	  if(track==true){
			        	  finalwin.setText("player one wins");  
			           setContentPane(finalresult);}
			           else {
			        	   finalwin.setText("player two wins");  
				           setContentPane(finalresult);   
			           }
			            }
		           if(track==true){
					   turn.setText("Player two turn");
					   track = false;}
				   else{  turn.setText("Player one turn");
					   track =true;}
	 			}
	 else if(e.getSource()==three) {
	    	String S1 =	String.valueOf(V1.get(2));
	    	three.setText(S1);
	        if(V1.get(2)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==four) {
	    	String S1 =	String.valueOf(V1.get(3));
	           four.setText(S1);
	           if(V1.get(3)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==five) {
	    	String S1 =	String.valueOf(V1.get(4));
	           five.setText(S1);
	           if(V1.get(4)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==six) {
	    	String S1 =	String.valueOf(V1.get(5));
	           six.setText(S1);
	           if(V1.get(5)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==seven) {
	    	String S1 =	String.valueOf(V1.get(6));
	           seven.setText(S1);
	           if(V1.get(6)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==eight) {
	    	String S1 =	String.valueOf(V1.get(7));
	           eight.setText(S1);
	           if(V1.get(7)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==nine) {
	    	String S1 =	String.valueOf(V1.get(8));
	           nine.setText(S1);
	           if(V1.get(8)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==ten) {
	    	String S1 =	String.valueOf(V1.get(9));
	           ten.setText(S1);
	           if(V1.get(9)==first){
		        	  if(track==true){
		        	  finalwin.setText("player one wins");  
		           setContentPane(finalresult);}
		           else {
		        	   finalwin.setText("player two wins");  
			           setContentPane(finalresult);   
		           }
		            }
	           if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==eleven) {
	    	String S1 =	String.valueOf(V1.get(10));
	    	eleven.setText(S1);
	        if(V1.get(10)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==twelve) {
	    	String S1 =	String.valueOf(V1.get(11));
	    	twelve.setText(S1);
	        if(V1.get(11)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==thirteen) {
	    	String S1 =	String.valueOf(V1.get(12));
	    	thirteen.setText(S1);
	        if(V1.get(12)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==fourteen) {
	    	String S1 =	String.valueOf(V1.get(13));
	    	fourteen.setText(S1);
	        if(V1.get(13)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==fifteen) {
	    	String S1 =	String.valueOf(V1.get(14));
	    	fifteen.setText(S1);
	        if(V1.get(14)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==sixteen) {
	    	String S1 =	String.valueOf(V1.get(15));
	    	sixteen.setText(S1);
	        if(V1.get(15)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==seventeen) {
	    	String S1 =	String.valueOf(V1.get(16));
	    	seventeen.setText(S1);
	        if(V1.get(16)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==eighteen) {
	    	String S1 =	String.valueOf(V1.get(17));
	    	eighteen.setText(S1);
	        if(V1.get(17)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==nineteen) {
	    	String S1 =	String.valueOf(V1.get(18));
	    	nineteen.setText(S1);
	        if(V1.get(18)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 else if(e.getSource()==twenty) {
	    	String S1 =	String.valueOf(V1.get(19));
	    	twenty.setText(S1);
	        if(V1.get(19)==first){
	        	  if(track==true){
	        	  finalwin.setText("player one wins");  
	           setContentPane(finalresult);}
	           else {
	        	   finalwin.setText("player two wins");  
		           setContentPane(finalresult);   
	           }
	            }
	        if(track==true){
				   turn.setText("Player two turn");
				   track = false;}
			   else{  turn.setText("Player one turn");
				   track =true;}
	            }
	 
	 }
	 
}
