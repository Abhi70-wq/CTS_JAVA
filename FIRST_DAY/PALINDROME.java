
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
    public void count_even_odd(int n){
        String str=Integer.toString(n);
        int i=0;
        int even_count=0;
        int odd_count=0;
        while(i<str.length()){
           if (str.charAt(i) == '0' || str.charAt(i) == '2' ||str.charAt(i) == '4' || str.charAt(i) == '6' ||str.charAt(i) == '8') {
            even_count++;       
            } else {
        odd_count++;
            }

            i++;
        }
        System.out.println("even count: "+even_count);
        System.out.println("odd even:  "+odd_count);
    }
}
public class PALINDROME {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        CHECK_PALINDROME CP=new CHECK_PALINDROME();
        //CP.palindrome(n);
        
        // String str=Integer.toString(n);
        // System.out.println(str.charAt(1));

        // System.out.println("using reverse function");
        // System.out.println(CP.REVERSE_FUNCTION(n));
        CP.count_even_odd(n);
    
    }

}
