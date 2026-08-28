import java.util.Scanner;
public class water
{
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter radius of a container:");
        int R=sc.nextInt();
        System.out.println("Enter height of a container:");
        int H=sc.nextInt();
        double volume=(int)(Math.round(3.14*R*R*H));
        System.out.println("the Volume of a container is:"+volume);
        sc.close();
    }
}
