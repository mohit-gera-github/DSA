public class primeinrange {
    public static boolean isPrime(int n) {
        int i;
        if (n == 2) {
            return true;
        }

        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primerange(int n){
        int i;
        for(i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        return 0;
    }
    public static void main(String args[]){
        primerange(10);
    }

    
}
