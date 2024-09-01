public class palindrome {
    public static int reverse(int Y){
        int reverse=0;
        int remainder;
        int num=Y;
        while(num>0){
            remainder=num%10;
            reverse=reverse*10 + remainder;
            num=num/10;
        }
        return reverse;
    }
    public static void palindrome(int X){
        int Y=reverse(X);
        if(X==Y){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Numnber is not palindrome");
        }

    }
    public static void main(String args[]){
        palindrome(102);

    }
    
}
