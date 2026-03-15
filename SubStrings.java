public class SubStrings {
    public static void main(String[] args) {
        //substring
        String str = "Hello World";
        //built in function
         String l = str.substring( 0,5);
        System.out.println(l);
        System.out.println(subString(str, 1, 5));

    }
    public static String subString(String str , int si , int ei){
        String subStr = "";
        for(int i=si ; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
}
