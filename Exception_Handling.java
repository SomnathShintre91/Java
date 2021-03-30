public class Exception_Handling {
    public static void main(String[] args) {

        try {
            int a = 30, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide a number by 0");
        }

        try {
            // String a = null; // null value
            // System.out.println(a.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }

        try {
            String c = args[2]; // accessing 25th element
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception");
        }

        try {
            // "akki" is not a number
            int num = Integer.parseInt("akki");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        } finally {
            System.out.println("EXCEPTION HANDLING!");
        }
    }
}