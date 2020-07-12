import java.util.Scanner;

public class Array_One {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Element\n");
		int read[]=new int[5];
		
		for(int i = 0; i<5; i++){
			read[i]= sc.nextInt();
		}
		System.out.println("Elements = ");
		for(int i = 0; i<5; i++){
			System.out.print(read[i] + "  ");
		}
		sc.close();
	}

}