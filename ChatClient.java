import java.net.*;
import java.io.*;

class ChatClient
{
	public static void main(String ...arg)
	{
		Socket s;
		InputStream is;
		OutputStream os;
		
		DataInputStream dis;
		DataOutputStream dos;
		String sendMsg,receiveMsg;
		
		try
		{
			s=new Socket("localhost",5555);
			System.out.println("Client Started....");
			is=s.getInputStream();
			os=s.getOutputStream();
			
			dis=new DataInputStream(is);
			dos=new DataOutputStream(os);
			
			BufferedReader br=new BufferedReader(
						new InputStreamReader(System.in));
			while(true)
			{
				System.out.print("\nClient Msg - ");
				sendMsg=br.readLine();
				dos.writeUTF(sendMsg);
				
				receiveMsg=dis.readUTF();
				
				System.out.println("Server Msg - "+receiveMsg);
				
				if(receiveMsg.equals("bye")) {
					break;
				}
			}
			dis.close();
			dos.close();
			os.close();
			is.close();
			s.close();
		}
		catch(Exception e) {
		System.out.println("Server Exception = "+e);
		}
		finally{	
		}
	}
}
