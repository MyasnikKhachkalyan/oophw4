import java.util.Scanner;

public class Temp{

    public static void start(){
        
        int[] temps = new int[30];
        Scanner myObj = new Scanner(System.in);
        System.out.println("input temperature for each day of the month(30 days)");

        for(int i=0; i<temps.length; i++){
            int temp = myObj.nextInt();
            temps[i] = temp;
        } 
        
        double sum = 0.0;
        int mintemp = temps[0];
        int maxtemp = temps[0];
        int hottestday = 1;
        int coldestday = 1;



        for(int i=1; i<temps.length; i++){
            if(maxtemp<temps[i]){
                maxtemp = temps[i];
                hottestday = i+1;
            }
            if(mintemp>temps[i]){
                mintemp = temps[i];
                coldestday = i+1;
            }
            sum += temps[i];
        } 

        System.out.println("Hottest day was " +hottestday + " with temperature " + maxtemp + " degree");
        System.out.println("Coldest day was " +coldestday + " with temperature " + mintemp + " degree");
        
        double average = sum/temps.length;
        System.out.println("average is " + average);

        int difference = maxtemp - mintemp;
        System.out.println("difference is " + difference);

            

    }
            
            

        
}