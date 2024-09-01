public class binomial {
    public static int factorial(int n){
        int f=1,i;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoeff(int n,int r)
    {
       int factN=factorial(n);
        int factR=factorial(r);
        int factNR=factorial(n-r);
        int bincoff=factN/(factR * factNR);
        return bincoff;
    }

    public static void main(String args[]){
        System.out.println(bincoeff(5,2));
    }
    
}
