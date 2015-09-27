
import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;
public class RMIclient {
	
	  
	public static void main(String args[] ) {
                     int message = 0;
                     ComputePI RmiServer;
              	   Registry registry;
                      try {
                    	  
                    	  String serverPort = args[1];
                          String serverAddress = args[0];
                    	   registry =LocateRegistry.getRegistry(
                                   serverAddress,(new Integer(serverPort)).intValue());
                                   
                    			   
                    	   RmiServer =  (ComputePI)(registry.lookup("rmiServer"));
        
                              RmiServer.Calculatedouble(message);
       
                             System.out.println(message);
       
                     } catch (Exception e) {
                             System.out.println("Something went wrong: " +
                                     e.getMessage());
                             e.printStackTrace();
                     }
               }	

}
