public class pq1{
    public static void search(int arr[],int idx,int key){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.println(idx+" ");
        }
        search(arr,idx+1,key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,4,2,2};
        search(arr,0,2);
    }
}