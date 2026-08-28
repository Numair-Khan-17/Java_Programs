import java.util.Scanner;
public class kaprekar {
 public static void main(String[]args){
    try (Scanner sc = new Scanner(System.in)) {
    int n = sc.nextInt();
    int square = n * n;
    int temp=n,digit=0;
    while(n>0){
        n=n/10;
        digit++;
    }
    int power = (int)Math.pow(10,digit);
    int right = square % power;
    int left = square / power;
    if(left+right==temp && right!=0){
        System.out.println("Kaprekar Number");
    }
    else{
        System.out.println("Not a Kaprekar Number");
    }
    }
 }   
}


    