import java .util.*;
public class dynamicprogramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int[] dp=new int[10];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<10;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(int i=0;i<n;i++){
            System.out.println("The sequence "+dp[i]+" ");
        }
}
}

