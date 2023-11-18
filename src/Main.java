// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] a = new int[n];
        for (int i =0 ; i<n;i++) {
            Scanner q = new Scanner(System.in);
            a[i] = q.nextInt();
        }

        sort(a);


        for (int i =0 ; i< n;i++){
            System.out.println(a[i]);
        }
    }

    public static void sort(int [] arr){
        int n = arr.length;
        for (int i = 0; i<n;i++){
            for (int j =0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }

            }
        }

    }
}