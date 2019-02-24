import java.util.Scanner;
public class Task6{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        int[] vect1 = new int[3];
        for(int i = 0; i<vect1.length; i++){
            vect1[i] = myObj.nextInt();
        }
        for(int i = 0; i<vect1.length; i++){
            System.out.print(vect1[i] + ",");
        }
        System.out.println();
        System.out.println();

        int[] vect2 = new int[3];
        for(int i = 0; i<vect2.length; i++){
            vect2[i] = myObj.nextInt();
        }

        for(int i = 0; i<vect1.length; i++){
            System.out.print(vect1[i] + ",");
        }
        System.out.println();
        System.out.println();

        int[] vect = new int[3];
        vect = vectProd(vect1, vect2);
        for(int i = 0; i<vect.length; i++){
            System.out.print(vect[i] + ",");
        }

        

        
    }

    public static int[] vectProd(int[] vect1, int[] vect2){
        int[] vect3 = new int[3];
        vect3[0] = vect1[1]*vect2[2] - vect1[2]*vect2[1];
        vect3[1] = vect1[0]*vect2[2] - vect1[2]*vect2[0];
        vect3[2] = vect1[0]*vect2[1] - vect1[1]*vect2[0];
        return vect3;
    }
}