import java.util.Scanner;

public class Task7{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("write two string length of 1st one bigger than length of 2nd one");
        String str1 = myObj.nextLine();
        String str2 = myObj.nextLine();
        int matchCount = 0;
        int matchCount2 = 0;

        String[] cyclShfts = new String[str2.length()];
        cyclShfts[0] = str2;
        for(int i=1; i<str2.length(); i++){
            cyclShfts[i] = cyclShfts[i-1].substring(1,cyclShfts[i-1].length()) + cyclShfts[i-1].charAt(0);
        }
        for(int i= 0; i<cyclShfts.length; i++){
            System.out.println(cyclShfts[i]);
        }

        for(int i = 0; i<=str1.length()-str2.length(); i++){
            for(int j= 0; j<cyclShfts.length; j++){
                if(str1.substring(i,i+str2.length()).equals(cyclShfts[j])){ 
                    matchCount++;
                }    
            }
        }
        System.out.println(matchCount);
        smth(0, str1, str2, cyclShfts, matchCount2);
    }

    public static void smth(int i, String str1, String str2, String[] cyclShfts, int matchCount2){
        if(i==str1.length()-str2.length()+1){
            System.out.println(matchCount2);
            return;
        }
        for(int j= 0; j<cyclShfts.length; j++){
            if(str1.substring(i,i+str2.length()).equals(cyclShfts[j])){ 
                matchCount2++;
            }    
        }
        smth(++i, str1, str2, cyclShfts, matchCount2);    
    }
}