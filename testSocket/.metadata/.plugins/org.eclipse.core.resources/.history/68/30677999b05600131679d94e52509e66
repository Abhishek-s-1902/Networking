import java.util.Collections;
import java.util.Vector;

import javax.swing.JButton;


public class Model {
	
	int first;
	Vector<Integer> V1 = new Vector();
	Vector<Integer> V2 = new Vector();
	
	boolean track = true;
	
	
	Model(){
	for(int i=0;i<20;i++){
		V1.add((int)( Math.random()*99 ));
		}
		
		for(int i=0;i<20;i++){
			V2.add(V1.get(i));
			}
		
		
		Collections.shuffle(V2);
		first = V2.get(0);
		
	}
	
	
	int getlucky(){
		return first;}
	
	Vector getButtonval(){
		return V1;
	}
	
}
