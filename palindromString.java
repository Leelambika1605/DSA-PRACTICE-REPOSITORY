public class palindromString {
    public static void main(String[] args) {
        String str = "racecaree";
        System.out.println(ispalindrome(str));
    

    }
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

}
