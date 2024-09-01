public class decorder{
    public static void printDec(int  n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int  n){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n* fact(n-1);
        }
    } 

    public static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n + sum(n-1);
        }
    }

    public static int fibo(int n){
        if(n==0){
            return 0;
        }else if(n==1) {
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static boolean isSorted(int arr[],int i){
        if (i== arr.length-1) {
            return true;            
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstOcc( arr, key, (i+1));
    }

    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound= lastOcc(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }

    public static int optPower(int x, int n){
        if(n==0){
            return 1;
        }

        int halfPower= optPower(x, n/2);
        int halfPowerSq= halfPower*halfPower;

        if(n%2 != 0){
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        // printDec(10);
        // printInc(10);
    //    System.out.println(fact(5));
    // System.out.println(sum(5));
    // System.out.println(fibo(7));

    int arr[]={1,2,7,5,9,3,5};
    // System.out.println(isSorted(arr, 0));
    // System.out.println(firstOcc(arr, 5, 0));
    // System.out.println(lastOcc(arr, 5, 0));
    System.out.println(optPower(2, 05));
        
    }
}   