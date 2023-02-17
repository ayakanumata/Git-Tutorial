import java.util.Scanner;
import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[]args){ //notice anything here?
        Scanner keyboard = new Scanner (System.in);
        
        int[] list = {16,12,6,8,2,12,14,37,11,47};
        int i = 5;

        System.out.println(list);
        keyboard.nextLine();

        System.out.println(list.length);
        keyboard.nextLine();

        System.out.println(list[i]+i);
        keyboard.nextLine();

        System.out.println(list[4]++);
        keyboard.nextLine();

        System.out.println(list[4]);
        keyboard.nextLine();

        /*list = {16,12,6,8,3,12,14,37,11,47};
            i = 5;*/
        System.out.println(i+""+list[i]);
        keyboard.nextLine();

        System.out.println(list[i]+1);
        keyboard.nextLine();

        System.out.println(list[i]+i+"");
        keyboard.nextLine();

        System.out.println((int) Math.pow(list[i],2));
        keyboard.nextLine();

        //System.out.println(list[i+i]);
        //keyboard.nextLine();

        /*list = {16,12,6,8,3,12,14,37,11,47};
            i = 5;*/
        System.out.println(list[2*--i]); //i=4
        keyboard.nextLine();
        
        System.out.println(list[2*i-3]);
        keyboard.nextLine();

        System.out.println(list[list[4]]);
        keyboard.nextLine();

        System.out.println(list[i++]); //i=5
        keyboard.nextLine();
        
        System.out.println(list[--i]); //
        keyboard.nextLine();

        /*list = {16,12,6,12,12,12,14,37,11,47};
            i = 4;*/
        list[i-1] = list[i]; //list[3]=list[4]
        list[i] = list[i+1];  //list[4]=list[5]
        list[i-1]=list[i];  //list[3] = list[4]
        System.out.println(list[i]+ " " + list[i-1]); 

        
        keyboard.close();
    }
}
