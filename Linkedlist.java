import java.io.*;
import java.util.LinkedList;
public class Linkedlist
{  
	public static void main(String args[])  
	{  
		LinkedList linkedlist = new LinkedList();
		LinkedList revLinkedList = new LinkedList();
		try  
		{  
			File file=new File("text.txt");    //creates a new file instance
			FileReader fr=new FileReader(file);   //reads the file  
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			String line;  
			
			while((line=br.readLine())!=null)  
			{  
				sb.append(line);
				linkedlist.add(line);
				//appends line to string buffer  
				sb.append("\n");     //line feed   
			}  
			fr.close();    //closes the stream and release the resources  
			//System.out.println("Contents of File: ");  
			//System.out.println(sb.toString());   //returns a string that textually represents the object  
			System.out.print("Elements before reversing: " + linkedlist);
			for (int i = linkedlist.size() - 1; i >= 0; i--) {
				// Append the elements in reverse order 
				revLinkedList.add(linkedlist.get(i));
			}
			System.out.print("\n\nElements after reversing: " + revLinkedList);
			
			}  catch(IOException e)  {  
				e.printStackTrace();  
			}  
	}  
}  