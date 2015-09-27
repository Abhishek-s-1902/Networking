import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;


public class client_connection implements Runnable{

	
	 static Hashtable user;
	 String resp, presentstate = "initial", rcpt; 
	 boolean bool = true;
	 Socket clientSocket ;
	 DataOutputStream outStream;
	 BufferedReader inReader;
	 String[] clientState = new String[10];
	 String command = null;
	 
	 client_connection(Socket socket){
		
		 user = new Hashtable();		
		
		File folder = new File("E:\\STUDY\\semster 3\\FCN\\main project\\dir1");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			 if (file.isDirectory()) {   
			System.out.println(file.getName());
		        user.put(file.getName(), file.getName());
			 }
		}
		
		 clientSocket = socket;
	}
	
	 
	 public void carryThree_method(String name,BufferedReader inReader,DataOutputStream outStream)
	 {
		 
		 
	 synchronized(user.get(name))
	 {
		 String file_detail = "";
		 String user_file = name;
		 File folder = new File("E:\\STUDY\\semster 3\\FCN\\main project\\dir1\\"+user_file);
		 File[] listOfFiles = folder.listFiles();	
		int count = 1;
		 try{
				
			command = inReader.readLine();
			clientState = command.split(" ");
				
				while(clientState[0] != "QUIT")
				{

					if(clientState[0].toUpperCase().equals("STAT") && presentstate.toUpperCase().equals("PASS"))
					{
						for (File file : listOfFiles) {
							   
							 file_detail =  file_detail+" "+count+" "+file.length()+"\n";
							 count++;       
						} 
						
						outStream.writeBytes(file_detail);
					}
					else if(clientState[0].toUpperCase().equals("RETR") && presentstate.toUpperCase().equals("PASS") 
							&& clientState[1]!=null)
					{
						int ret = Integer.parseInt(clientState[1]);
						String file1 = listOfFiles[ret].toString();
						for(String line : Files.readAllLines(Paths.get(file1))) 
						{
							 System.out.println("line: "+ line);
							 file_detail = file_detail + line; 
						}
						 
						outStream.writeBytes("file "+ret+": /n "+file_detail);
					}
				}
				
				bool = false;
				inReader.close();
				outStream.close();
				clientSocket.close();
				return;
		 }catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	 }
					
	 }
	 
	 
	
	public void run() {
		
		 //DataOutputStream outStream;
		 //BufferedReader inReader;
		
		 
		//ArrayList<String> address_List = new ArrayList<String>();
		//static String[] mailAddress = new String[5];
		
		//static InetAddress address_from = null , address_to = null;
		 String  this_user = null;	
	
	 //clientSocket = socket;
		 String pass = null;
		
		try{
				
				inReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				outStream = new DataOutputStream(clientSocket.getOutputStream());
				
				while(bool = true)
				{
					
				command = inReader.readLine();
				clientState = command.split(" ");
					
				if(!clientState[0].toUpperCase().equals("USER") && presentstate.equals("initial"))
				{
					resp = "-ERR you need to fist provide username";
					outStream.writeBytes(resp);
					continue;		
				}
				else if(clientState[0].toUpperCase().equals("USER")&& presentstate.equals("initial")&& clientState[1]!= null)
				{
					if(user.containsKey(clientState[1])== true)
					{
						resp = "+OK User name accepted, password please";
						outStream.writeBytes(resp);
						pass = "USER";
						this_user = clientState[1];
						continue;
					}	
					else
					{
						resp = "-ERR User name doesn't exist, please provide correct user";
						outStream.writeBytes(resp);
						continue;
					}
					
				}
				else if(clientState[0].toUpperCase().equals("PASS")&& pass.equals("USER")&& clientState[1]!= null)
				{
					if(clientState[1].equals(user.get(this_user)))
					{
						resp = "+OK User name accepted, password please";
						outStream.writeBytes(resp);
						presentstate = "PASS";
						carryThree_method(this_user,inReader,outStream);
						
						continue;
					}	
					else
					{
						resp = "-ERR User name doesn't exist, please provide correct user";
						outStream.writeBytes(resp);
						continue;
					}
					
				}
				
				}		
						
			
				
			}
			
			catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}
}

