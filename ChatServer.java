import java.net.*;
import java.io.*;

class ChatServer
{
	public static void main(String ...arg)
	{
		ServerSocket ss;
		Socket s;
		InputStream is;
		OutputStream os;
		DataInputStream dis;
		DataOutputStream dos;
		String sendMsg,receiveMsg;
		try
		{
			ss=new ServerSocket(5555);
			System.out.println("Server Started....");
			System.out.println("Waiting for client....");
			s=ss.accept();
			
			is=s.getInputStream();
			os=s.getOutputStream();
			dis=new DataInputStream(is);
			dos=new DataOutputStream(os);
			
			BufferedReader br=new BufferedReader(
						new InputStreamReader(System.in));
			 
				while(true)
				{
					receiveMsg=dis.readUTF();
					System.out.println("Client Msg - "+receiveMsg);
					if(receiveMsg.equals("bye")) {
						break;
					}
					System.out.print("\nServer Msg - ");
					sendMsg=br.readLine();
					dos.writeUTF(sendMsg);
				}
			dis.close();
			dos.close();
			os.close();
			is.close();
			s.close();
		}
		catch(Exception e){
		System.out.println("Server Exception = "+e);
		}
		finally {
		}
	}
}
