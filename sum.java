import java.util.Scanner;
public class sum
{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int value=sc.nextInt();//1002
     int last_digit=value%10;//1002%10=2
     int first_digit=value/1000;//1002/1000=1
     int sum=first_digit+last_digit;//1+2=3
     System.out.println(sum);
     sc.close();

        
    }

}

