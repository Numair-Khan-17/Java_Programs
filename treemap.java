import java.util.*; 
public class treemap
{
public static void main(String[] args) 
{
    TreeMap<Integer,String>t=new TreeMap<>();
 // Adding elements to the TreeMap
    t.put(101,"priya");
    t.put(102,"divya");
    t.put(103,"sneha");
    t.put(104, "ojus");
 // Displaying the elements of the TreeMap
    System.out.println(t);
   t.remove(102);
    System.out.println(t);
    System.out.println(t.containsKey(103));
    System.out.println(t);

    }
    
}
