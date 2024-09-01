public class bintodec {
    
    public static void bintodec(int n){
        int mynum=n;
        int pow=0;
        int dec=0;
        while(n>0){
            int lastdig=n%10;
            dec=dec+(lastdig * (int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of " + mynum + " is :" + dec);
     }
     public static void main(String args[])
     {
        bintodec(1000);
     }
}
