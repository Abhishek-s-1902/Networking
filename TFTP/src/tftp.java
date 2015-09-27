import java.io.FileOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/*
 * @Author: Abhishek Sharma
 * @Date: 26/09/2014
 * Project-1: 
 * @tftp: It Implements the connect and get functionality similar to TFTP protocol
 *   
 */

public class tftp {
	
	//@address: stores the IP address user wants to connect
	static InetAddress address;
	
	//@connect:  It Implements the connect functionality similar to TFTP protocol
	public static void connect(String S1){
		
		
		String address_01 = S1;
		try{
		address = InetAddress.getByName(address_01);
		
		}catch(Exception ex){
			System.out.println(" exception occour "+ ex);
		}
		
	}
	
	//@get:  It Implements the get functionality similar to TFTP protocol
	public static void get(String cmd_File )
	{
		/*
		 * All variables are used for storing buffer data and fileoutput stream to 
		 * write the file into local disk 
		 */
		byte[] buffer_REQ;
		byte[] buffer_REQ_data;
		byte[] buffer_RECV = new byte[516];
		byte[] buffer_ACQ = new byte[4];
		FileOutputStream file_output;
		byte[] buffer_REQ_mode;
		int size;
		String File = cmd_File;
		String S1 = new String(File);
		buffer_REQ_data = S1.getBytes();
		
		//@S2: for keeping the default mode as octet:
		String S2 = "octet";
		buffer_REQ_mode = S2.getBytes();
		try
		{
					
			size = S1.length();
			size += S2.length();
			size += 4;
			buffer_REQ = new byte[size];
			buffer_REQ[0] = 0;
			buffer_REQ[1] = 1;
			
			
			
			for(int i =0,j=2;i<buffer_REQ_data.length; i++,j++)
			{
				buffer_REQ[j] = buffer_REQ_data[i];
			}
			
			buffer_REQ[buffer_REQ_data.length+2] = 0;
			int new_size = buffer_REQ_data.length+3;
			for(int i = 0,j=new_size;i<buffer_REQ_mode.length; i++,j++)
			{
				buffer_REQ[j] = buffer_REQ_mode[i];
			}
			
			buffer_REQ[size-1] = 0;
			
			//@pkt_REQ: datagram packet for sending the request
			DatagramPacket pkt_REQ = new DatagramPacket(            
					buffer_REQ, buffer_REQ.length, address, 69);
					
			DatagramSocket datagramSocket = new DatagramSocket();
			
			//@setSoTimeout(): For checking the maximum time out limit
			datagramSocket.setSoTimeout(5000);
			datagramSocket.send(pkt_REQ);
																		
			//@pkt_RECV: Datagram packet for receiving the request
			DatagramPacket pkt_RECV = new DatagramPacket(buffer_RECV, buffer_RECV.length);
			
			byte[] buffer = new byte[516];
			
			//@file_output: FileOutputStream for writing the file into disk 
			file_output = new FileOutputStream(File);					
			
			do{
			datagramSocket.receive(pkt_RECV);           
			buffer = pkt_RECV.getData();
			byte[] temp = new byte[buffer.length-4];
			
			if(buffer[1] ==5 ){
				 
				 int error_code = buffer[3];
				 
			//@switch: handles different types of errors	 
				 switch (error_code)
				 {
				 case 0:
					System.out.println("Error code 0: "+ Arrays.copyOfRange(buffer,3 , buffer.length-1) );
					break;
				 case 1:
					 System.out.println("Error code 1: File not found." ); 
					 break;
				 case 2:
					 System.out.println("Error code 0: Access violation." ); 
					 break;
				 case 3:
					 System.out.println("Error code 0:  Disk full or allocation exceeded." ); 
					 break;
				 case 4:
					 System.out.println("Error code 0:  Illegal TFTP operation." ); 
					 break;
				 case 5:
					 System.out.println("Error code 0:  Unknown transfer ID." ); 
					 break;
				 case 6:
					 System.out.println("Error code 0:  File already exists." );  
					 break;
				 case 7:
					 System.out.println("Error code 0:  No such user." ); 
					 break;
				 }
				 
			 }else{
				 for(int i =0,j=4;i<temp.length; i++,j++)
					{
						temp[i] = buffer[j];
					}
					
					file_output.write(temp);
			buffer_ACQ[0] = 0;
			buffer_ACQ[1] = 4;
			buffer_ACQ[2] = buffer[2];
			buffer_ACQ[3] = buffer[3];
			int port = pkt_RECV.getPort();
			DatagramPacket pkt_ACK = new DatagramPacket(buffer_ACQ,buffer_ACQ.length,address,port);
			
			datagramSocket.send(pkt_ACK);
			}
		}while(pkt_RECV.getLength()==516);
			
			 
			file_output.close();
					
		}catch(Exception ex){
			System.out.println(" exception occour: " + ex);
			
	}
}
	
	
	/*
	 * @main: Takes required input command request and file name and calls the 
	 * respective functions
	 */
	public static void main(String args[]){
		
		 
		Scanner S1 = new Scanner(System.in);
		System.out.print("tftp> ");
		String command = S1.nextLine();
		String[] cmd_File = command.split(" ");
		//System.out.println();
		
		while(!cmd_File[0].equals("connect")){
			
			System.out.print("tftp> ");
			System.out.println("you need to first connect");
			System.out.print("tftp> ");
			command = S1.nextLine(); 
			cmd_File = command.split(" ");
			
			}		
		
		if(cmd_File.length<2){
			System.out.println("connect to: ");
			cmd_File[0] = S1.nextLine();
			connect(cmd_File[0]);
		}else
			connect(cmd_File[1]);
		
		System.out.print("tftp> ");
		 command = S1.nextLine();
		 
		 cmd_File = command.split(" ");
		
		 while(!cmd_File[0].equals("quit")){
			 if(!cmd_File[0].equals("get")){
				 System.out.print("tftp> ");
				 System.out.println("command not found in the liberary");
			}else{
				if(cmd_File.length>1)
				get(cmd_File[1]);
				else
					System.out.println("please enter the fine name also");
			}
			 System.out.print("tftp> ");
			 command = S1.nextLine();
			 cmd_File = command.split(" ");
		} 
		 System.exit(0);
	}

}
