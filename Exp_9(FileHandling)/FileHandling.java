import java.io.*;
import java.util.Scanner;

class FileHandling 
{
	public static int appendStrToFile(String fileName,  String str) 
    { 
        try { 
            // Open given file in append mode. 
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true)); 
            out.write(str); 
            out.close(); 
			return 1;
        } catch (IOException e) { 
            return 0;
        } 
    } 
	
	public static void main(String args[])
	{
		String file_name;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t--File Handling--\n");
		System.out.print("Enter the file name: ");
		file_name = sc.next();
		
		try {
			FileReader fr = new FileReader(file_name);
			
			int data, req = 1;
			System.out.println("File Exits..");
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}

			System.out.println("\n\n1.do you want to add the data at the end of file or \n2.replace specified text in file by other text");
			System.out.print("Choice one: ");
			req = sc.nextInt();
			String adata;
			
			if(req == 1) {
				System.out.print("\nEnter the data: ");
				sc.useDelimiter("\\t");
				while(true){
					adata = sc.next();
					break;
				}
				//adata = "\n" + adata;
				int c = appendStrToFile(file_name, adata);
				
				if(c == 1)
					System.out.println("Data appended..");
				else 
					System.out.println("Data not appended..");
			}
			if(req == 2) {
				//Instantiating the Scanner class to read the file
				Scanner sc1 = new Scanner(new File(file_name));
				//instantiating the StringBuffer class
				StringBuffer buffer = new StringBuffer();
				//Reading lines of the file and appending them to StringBuffer
				while (sc1.hasNextLine()) {
					buffer.append(sc1.nextLine()+System.lineSeparator());
				}
				String fileContents = buffer.toString();
				//System.out.println("Contents of the file: "+fileContents);
				//closing the Scanner object
				sc1.close();

				String oldLine;
				System.out.print("\nEnter the oldline: ");
				sc.useDelimiter("\\t");
				while(true){
					oldLine = sc.next();
					break;
				}
				String newLine;
				System.out.print("\nEnter the newLine: ");
				while(true){
					newLine = sc.next();
					break;
				}

				//Replacing the old line with new line
				fileContents = fileContents.replaceAll(oldLine, newLine);
				//instantiating the FileWriter class
				FileWriter writer = new FileWriter(file_name);
				System.out.println("");
				System.out.println("New data: "+fileContents);
				writer.append(fileContents);
				writer.flush();
			}

		} catch(FileNotFoundException fne) {
			
			System.out.println("File Does Not Exits..");
			try{
				File newf = new File(file_name);
				newf.createNewFile();
				System.out.println("New file cerated..");
				FileWriter myWriter = new FileWriter(file_name);
				System.out.print("Write data into file: ");
				String fdata;
				sc.useDelimiter("\\t");
				while(true){
					fdata = sc.next();
					break;
				}
				
				myWriter.write(fdata);
				myWriter.close();
				System.out.println("Successfully wrote to the file.");
				
			} catch (IOException e) { 
				System.out.println("Exception Occurred" + e); 
			}
		} catch (IOException ie) {
			System.out.println("Exception Occurred" + ie); 
		}
	}
}