public class vowelCount {
    public static void main(String[] args) {
        StringBuilder newStr = new StringBuilder();
        String str = "leelambika R";
        int count = 0;
 
    
   
        
            for(int i=0;i<str.length()-1;i++){
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                    count++;
                   

                }
            }
              System.out.println("count of Vowels is :" + count);
            
    }

}