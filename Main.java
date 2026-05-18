import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many terms you want: ");
        int n = sc.nextInt();

        Fabonacci series = new Fabonacci();
        series.series(n);
        sc.close();
    }
}