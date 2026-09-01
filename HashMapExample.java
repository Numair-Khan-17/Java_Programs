import java.util.*;
public class HashMapExample{
	public static void main(String[] args) {
	    HashMap<Integer,String>map=new HashMap<>();
	    map.put(101,"Gayas");
	    map.put(102,"Kiran");
	    map.put(103,"komal");
	    int key=101;
	    if(map.containsKey(key)){
	        System.out.print("Found :"+map.get(key));
	    }
	    else{
	        System.out.print("Not Found");
	    }
	}
}
