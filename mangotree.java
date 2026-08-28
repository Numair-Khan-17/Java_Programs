import java.util.Scanner;
public class mangotree 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int tree = sc.nextInt();
        if (tree <= columns || tree > (rows - 1) * columns
            || tree % columns == 0 || tree % columns == 1){
            System.out.print("mango tree");
        }
        else{
            System.out.print("not a mango tree");
        }
        sc.close();
    }
}
