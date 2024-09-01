public class pq2 {
    public static void string(int num){ 
        if(num == 0){
            return;
        }
    String numbers[] ={"zero", " one", "two","three","four","five","six","seven","eight","nine"};
    int lastnumber = num%10;
    string(num/10);
    System.out.print(numbers[lastnumber]+ " ");
    }

    public static void main(String[] args) {
        string(2863);
    }
}
