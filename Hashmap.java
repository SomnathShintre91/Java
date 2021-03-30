import java.util.*;

class HashMapper{
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	LinkedHashMap<Integer, String> linkedmap = new LinkedHashMap<Integer, String>();
	
	public void fillMap(){
		Random rand = new Random(42);
		int k;
		for (int i=0; i<10; i++){
			k = rand.nextInt(i+20);
			map.put(k, Integer.toString(k));
		}
		System.out.println("\nHash code order: " + map);
	}
	
	public void remap(){
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> it;
		int temp;
		int smallest;
		int iterations = keyset.size(); 
		System.out.println("\nInserting into LinkedHashMap...");
		System.out.println("Key	Values");
		System.out.println("--------------");
		for (int i = 0; i < iterations; i++) {
			it = keyset.iterator();
			smallest = it.next();
			it = keyset.iterator();
			while(it.hasNext()) {
				temp = it.next();
				if (temp < smallest) smallest = temp;
			}
			linkedmap.put(smallest, map.get(smallest));
			System.out.println(smallest+"	"+map.get(smallest));
			keyset.remove(smallest);
		}
		System.out.println("\nSorted LinkedHashMap(insertion order maintained): " + linkedmap);
	}
}

public class Hashmap {
	public static void main(String[] args) {
		HashMapper hm = new HashMapper();
		hm.fillMap();
		hm.remap();
	}
}