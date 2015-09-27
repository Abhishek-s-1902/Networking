import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.net.*;

public class ServerDouble extends UnicastRemoteObject implements ComputePI{

	static Registry registry;
    ComputePI RmiServer;
	int number = 0;
	protected ServerDouble() throws RemoteException
	{
		super();
	}
	public int Calculatedouble(int i) throws java.rmi.RemoteException
	{
		this.number = i;

		//System.out.println(i);
	 caculateDouble();
	 return number;
	}

	void caculateDouble()
	{
		number =  number*2;
	}


	public static void main(String args[])
     {
        // Create and install a security manager
        // System.setSecurityManager(new RMISecurityManager());

        System.out.println("you want to be a server or a client Type 'server' or 'client'");
        Scanner in = new Scanner(System.in);
        String S = in.nextline();

    if(S.toUpperCase().equals("SERVER"))
    {
       try {
    	   ServerDouble obj = new ServerDouble();
    	   registry = LocateRegistry.createRegistry(5555);
           registry.rebind("rmiServer", obj);


          System.out.println("ServerDouble bound in registry");
           } catch (Exception e) {
             System.out.println("ServerDouble err: " + e.getMessage());
             e.printStackTrace();
            }
     }


     if(S.toUpperCase().equals("CLIENT"))
     {
        int message = 5;
         try {


                    	   registry =LocateRegistry.getRegistry(
                                   "localhost",5555);


                    	   RmiServer =  (ComputePI)(registry.lookup("rmiServer"));

                            message=  RmiServer.Calculatedouble(message);

                             System.out.println(message);

                     } catch (Exception e) {
                             System.out.println("Something went wrong: " +
                                     e.getMessage());
                             e.printStackTrace();
                     }
     }

}
}
