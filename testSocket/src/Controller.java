import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private View theView;
	private Model theModle;
	
	public Controller(ActionEvent e){
		
		this.theView.actionPerformed(e);	
		
	}
	
	
	void setInitialval(View theView,Model theModle){
	this.theView = theView;
	this.theModle = theModle;
	
	 this.theView.clicklistner(new addListner());
	 
	 this.theView.setLuckyval(this.theModle.getlucky());
	 this.theView.setButtonval(this.theModle.getButtonval());
	 
	}
	
	class addListner implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			 
			theView.actionPerformed(e);	 
			
	}
	
	
}
}