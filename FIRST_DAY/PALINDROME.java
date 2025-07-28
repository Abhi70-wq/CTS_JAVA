
import java.util.Scanner;
class CHECK_PALINDROME{
    public void palindrome(int n){
        int ori=n;
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        if(ori==ans){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public int REVERSE_FUNCTION(int n){
         String rev = new StringBuilder(Integer.toString(n)).reverse().toString();
        return Integer.parseInt(rev); 
    }
}
public class PALINDROME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        CHECK_PALINDROME CP=new CHECK_PALINDROME();
        CP.palindrome(n);
        
        String str=Integer.toString(n);
        System.out.println(str.charAt(1));

        System.out.println("using reverse function");
        System.out.println(CP.REVERSE_FUNCTION(n));
    
    }

}
