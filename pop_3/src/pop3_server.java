
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class pop3_server {

	
	
	
	public static void listen()
	{
		 ServerSocket serverSocket;
		 String command, message, from, to;
		 String[] clientState = new String[10];
	
		 try{
			 
			 serverSocket = new ServerSocket(25);
			 System.out.println("waiting for client.. ");
			 
			 while(true)
			 {
				 Socket clientsocket = serverSocket.accept();
				 client_connection C1 = new client_connection(clientsocket);
				 //C1.run();
				 
				 Thread X = new Thread(C1);
				 X.start();
			 }	 
			 
		 }
		 catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
	

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listen();
	}

}
