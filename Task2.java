import java.util.Scanner;
import java.lang.Math.*;

public class Task2{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        int m = myObj.nextInt();
        boolean mIsPrime = false;
        double primeCounter = 0.0;
        for(double j = 2.0; j<=Math.sqrt(m); j++){
            if(m%j!=0.0){
                mIsPrime = true;
            }
            else {
                mIsPrime = false;
                break;
            }
        }
        if(mIsPrime) {
            System.out.println("prime" + m);
            primeCounter ++;
        }
        System.out.println("input 100 or 200 or  ... or 1000");
        int k = myObj.nextInt();
        for(int i = 0; i<k; i++){
            double randNum = Math.floor(Math.random()*m);
            boolean randNumIsPrime = false;
            for(double j = 2.0; j<=Math.sqrt(randNum); j++){
                if(randNum%j!=0.0){
                   randNumIsPrime = true;
                }
                else{
                    randNumIsPrime = false;
                    break;
                }
            }
            if(randNumIsPrime) {
                System.out.println("prime" + randNum);
                primeCounter ++;
            }
        }
        double percentage = primeCounter/m*100;
        System.out.println(percentage + "%"); // this may not be acurate as random numbers might be the same so same number may be counted more than one time
        // greater k more acurate the parcantage will be, in case of 100 and 1000 the acuracy depends on m, if m is very big number than in case of 1000 the acuracy will be 10 time more.
    }
}