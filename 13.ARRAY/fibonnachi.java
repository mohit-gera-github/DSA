public class fibonnachi {
    public static void FiboSeries(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i=0;i<n-2;i++){
             int c =  a+b;
             a = b;
             b= c;
             System.out.print(c+ " ");  
        } 
    }
    public static void main(String args[]){
        FiboSeries(6); 
    }
}
