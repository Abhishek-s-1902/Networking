import java.io.*;
import java.net.*;

public class Client {

	
public static void main(String args[])throws IOException,ClassNotFoundException{
	
	BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in)); 

	System.out.println("Please enter the Host");
	String name = new String(consoleIn.readLine());
	new Client().runClient(name);
		
}


void runClient(String S1)throws IOException,ClassNotFoundException{
	
	
	Socket mySocket = new Socket("127.0.0.1",Integer.parseInt(S1));
	try{
	
	PrintWriter out =
            new PrintWriter(mySocket.getOutputStream(), true);
	
	BufferedReader in = new BufferedReader(
            new InputStreamReader(mySocket.getInputStream()));
	BufferedReader stdIn =
            new BufferedReader(
                new InputStreamReader(System.in));
	

        String userInput;
        userInput = in.readLine();
       
            System.out.println(userInput);
            
            userInput =  stdIn.readLine();
            out.println(userInput);
        
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


