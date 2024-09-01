public class hollowrec{
    public static void pattern(int rows,int column){
        for(int i =1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || j==1 || i==rows || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(4,5);
    }
}