import java.util.Scanner;
public class divide
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int a=sc.nextInt();
            System.out.println("Enter the second number: ");
            int b=sc.nextInt();
            if(b==0){
                throw new ArithmeticException("the value is not divided by zero");
            }
            int result=a/b;
            System.out.println("the result is: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("division calculation is completed");
        }
    }
}