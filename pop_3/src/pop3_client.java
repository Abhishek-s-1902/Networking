
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * @Author: Abhishek Sharma/ Jie yuan
 * Date: 10/12/2014
 * project: POP3
 * 
 */

/*
 * @pop3_client: this class implements client side of POP3 and communicates
 * with POP server through TCP connection. 
 */


public class pop3_client 
{

	
	public static void connect(String host, int port)	
	{
	
		int socketTimeoutTime = 20; //seconds
		DataOutputStream outStream;
		BufferedReader inReader;
		Socket socket;
		
		String client_state = "initiate";
		Scanner S1 = new Scanner(System.in);
		String response_string[],user_string[];
		
		String command;
		try {
			socket = new Socket(host,port);
			
			inReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outStream = new DataOutputStream(socket.getOutputStream());
			
			while(!client_state.toUpperCase().equals("QUIT")){
				
				String serverResponse = inReader.readLine();
				System.out.println(serverResponse);
				
				
					System.out.println("enter next command: ");
					command = S1.nextLine();
					user_string = command.split(" ");
					
					if(user_string[0].toUpperCase().equals("QUIT"))
					{
						String resp = "QUIT !\r\n";
						outStream.writeBytes(resp);
						outStream.close();
						inReader.close();
					}
					else
					{
						System.out.println("inside else");
						outStream.writeBytes(command+ " !\r\n");
						continue;
					}
					
					
				}
			}catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println(" Could not listen on port: 110 ");
	            System.exit(1);
			}
		
	}
	
	public static void main(String[] args) 
	{
		
		int port = 110;
		String host = args[0];
		
		connect(host, port);
		
	}

}
