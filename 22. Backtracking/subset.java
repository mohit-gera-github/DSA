public class subset{
    public static void Subset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }else {
                System.out.println(ans);
            }

            return;
        }
        // condition yes
        Subset(str, i+1, ans+ str.charAt(i));
        // condition no
        Subset(str, i+1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        Subset(str, 0, "");
    }
}