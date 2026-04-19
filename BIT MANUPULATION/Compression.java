public class Compression {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        System.out.println(compression(str));

    }
    public static String compression(String str){
        StringBuilder newStr = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            int count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
                
            }

            newStr.append(str.charAt(i));

            if(count > 1){
                newStr.append(count);
            }

        }

        return newStr.toString();
    }
}
