public class linearsearch {
    public static int LSearch(int numbers[], int key)
    {
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={1,5,2,7,9,12,54,76,23,87,34,8,10,63};
        int key=87;
        int search=LSearch(numbers,key);
        if(search==-1)
        {
            System.out.println("Element not found");
        }
        else
        System.out.println("Element found at "+ search + " Index");
    }
    
}
