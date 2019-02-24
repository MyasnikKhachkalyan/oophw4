import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        int number = myObj.nextInt();
        int digit = number; 
        int help = number;
        int step = 0;
        for(;digit>=10;help=digit){
            digit=0;
            while(help!=0){
                digit += help%10;
                help = (help - help%10)/10;
                step++;
            }
        }
        System.out.println(digit);
        System.out.println(step + " steps");

    }
    
}