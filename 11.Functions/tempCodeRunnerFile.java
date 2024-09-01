blic class sum {
    public static int Sum(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A and B");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int sum=Sum(A,B);
        System.out.println("Sum of A + B is " + sum);
        
    }
    
}
