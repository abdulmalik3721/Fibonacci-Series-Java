public class Fabonacci{
    public void series(int n ){
        int a=0,b=1;
        System.out.println("Fabonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.print(a + "  ");
             
             
            int c=a+b;
            a=b;
            b=c;
           
        }
    }
}