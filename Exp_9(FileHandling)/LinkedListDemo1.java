import java.util.*;
class LinkedListDemo1
{
public static void main(String ...arg)
{
LinkedList l=new LinkedList();
l.add("Tech");
l.add(10);
l.add(null);
System.out.println("LinkedList = "+l);
l.addFirst("Java");
l.addLast("Oracle");
l.add("Zone");
System.out.println("LinkedList = "+l);
l.set(5,"C++");
System.out.println("LinkedList = "+l);
System.out.println("Removing objects from linkedlist...");
System.out.println("Removed Object = "+l.removeLast());
System.out.println("LinkedList = "+l);
}
}