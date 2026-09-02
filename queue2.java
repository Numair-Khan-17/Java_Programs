
import java.util.*;
public class queue2
{
  public static void main(String[] args) 
  {
    Queue<Integer> q = new LinkedList<>();
    q.add(10);
    q.add(20);
    q.add(30);
    System.out.println(q);
    System.out.println("Remove"+q.poll());
    System.out.println(q);
    System.out.println("first element: "+q.peek());
  }
}
