public class tiling {
    public static int tilingPro(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }

        // vertical
        int fnm1 = tilingPro(n-1);

        // horizontal
        int fnm2 =tilingPro(n-2);

        int totalways= fnm1 + fnm2;

        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingPro(5));
        
    }
    
}
