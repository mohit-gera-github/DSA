public class reverse {
    public static void Rev(int numbers[]){
        int start=0,end=numbers.length-1;
        while(start<end) {
        int temp=numbers[end];
        numbers[end]=numbers[start];
        numbers[start]=temp;
        start++;
        end--;
        }
    }
    public static void main(String args[]){
        int numbers[]={1,3,4,67,89,56,90};
        Rev(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
