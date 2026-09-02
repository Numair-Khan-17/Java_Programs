import java.util.*;
public class deque
{
  public static void main(String[] args) 
  {
    Deque<Integer> q = new ArrayDeque<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.removeLast();
    q.removeFirst();
    System.out.println(q);
    q.addFirst(54);
    System.out.println(q);
  }
  }

