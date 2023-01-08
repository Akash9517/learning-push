import java.util.*;;
public class text {
    

    public static void main(String[] args) {

        int n;
        Scanner s=new Scanner(System.in);

        n=s.nextInt();
        


        for (int i = 0; i >= n; i--)
         {

            for (int j =1  ; j <=i ; j--)
             {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
