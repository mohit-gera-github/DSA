import java.util.ArrayList;

// brute force
public class PairSum1 {
    public static boolean Psum1(ArrayList<Integer> list,int target ){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }   
        }
        return false;
    }
    //  optimised using 2 pointer
    public static boolean opPsum1(ArrayList<Integer> list,int target ){
        int lp=0;
        int rp= list.size()-1;
        while(lp<rp){
            // case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            // case 2 and 3
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static boolean pSum2(ArrayList<Integer> list,int target){
        // find breakpoint
        int bp=-1;
        int n= list.size();

        for(int i =0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp) == target){
                return true;
            }

            if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%n;
            }else{
                rp = ( n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        // System.out.println(Psum1(list,20));

        // System.out.println(opPsum1(list, 5));

        System.out.println(pSum2(list2, 20));
    }
    
}
