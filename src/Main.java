import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter array's lengt");
        int n=scanner.nextInt();
        int[] list=new int[n];
        for (int i=0;i<list.length;i++){
            System.out.println("enter "+(i+1)+"th number");
            list[i]=scanner.nextInt();

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}