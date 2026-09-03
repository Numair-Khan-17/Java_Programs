import java.util.*; 
public class treeset 
{
public static void main(String[] args) 
{
    TreeSet<Integer> treeSet = new TreeSet<>();
 // Adding elements to the TreeSet
    treeSet.add(50);
    treeSet.add(20);
    treeSet.add(40);
    treeSet.add(70);
 // Displaying the elements of the TreeSet
    System.out.println(treeSet);
    treeSet.remove(20);
    System.out.println(treeSet);
    System.out.println(treeSet.contains(40));
    System.out.println(treeSet);

    }
    
}