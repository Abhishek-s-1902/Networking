import java.io.*;
import java.net.*;
import java.util.*;
public class Server {
	
	
	public static final int port = 5555;
	public static void main(String args[])throws IOException,ClassNotFoundException{
		
		new Server().runServer();
		
	}	
		
		
	void runServer()throws IOException,ClassNotFoundException{
		
		ServerSocket serversocket = new ServerSocket(port);
		
		System.out.println("Server up & ready for connetion.....");
		
		try{
			Socket mySocket = serversocket.accept();
			 
			 PrintWriter out =
			            new PrintWriter(mySocket.getOutputStream(), true);
				
				BufferedReader in = new BufferedReader(
			            new InputStreamReader(mySocket.getInputStream()));
				BufferedReader stdIn =
			            new BufferedReader(
			                new InputStreamReader(System.in));
				
				out.println("Hello Client: you are connected now.. ");
				//out.println("are you going to play first, press: Y or N");
			
			
		        String userInput = new String();
		        userInput = in.readLine();
		        while(in.readLine().toUpperCase()!="Y"|| in.readLine().toUpperCase()!="N"){
		       
		            System.out.println(userInput);
		            System.out.println(userInput);}
		        
		    } catch (UnknownHostException e) {
		        System.err.println("Don't know about host ");
		        System.exit(1);
		    } catch (IOException e) {
		        System.err.println("Couldn't get I/O for the connection to " 
		            );
		        System.exit(1);
		    } 
			
		
		
		
		
		
		
		//ObjectInputStream objectinputstream = new ObjectInputStream(serverSocket.getInputStream());
		//ObjectOutputStream objectoutputstream =new ObjectOutputStream(serverSocket.getOutputStream());
		
		
		
		}
		
		
}	
	
	
	//Controller C1;
	//V1.setVisible(true);
	
	
	




/*BufferedReader stdIn =
new BufferedReader(
    new InputStreamReader(System.in))

String userInput;
while ((userInput = stdIn.readLine()) != null) {
    out.println(userInput);
    System.out.println("echo: " + in.readLine());
}

only one object of the controller


*/
