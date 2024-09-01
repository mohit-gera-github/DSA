public class friendsPairing {
    public static int fpairing(int n){
        if(n==1 ||n==2){
            return n;
        }
        return fpairing(n-1) + (n-1) * fpairing(n-2); 
    }

    public static void main(String[] args) {
        System.out.println(fpairing(3));
    }
    
}
