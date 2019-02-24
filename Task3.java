import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        int n = myObj.nextInt();
        long[] fib = new long[n]; 
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i<n; i++){
            fib[i]= fib[i-1] + fib[i-2]; 
        }
        System.out.println(fib[n-1]);

        fibNum(n);
        
    }

    public static void fibNum(int n){
        long[] fib2 = new long[n]; 
        fib2[0] = 0;
        fib2[1] = 1;

        fibNum2(n, fib2, 2);
    }

    public static void fibNum2(int n, long[] fib2, int index){
        if(index==n-1){
            fib2[index]= fib2[index-1] + fib2[index-2];
            System.out.println(fib2[index]);
            return;
        }
        fib2[index]= fib2[index-1] + fib2[index-2]; 
        fibNum2(n, fib2, ++index);
        
    }

}