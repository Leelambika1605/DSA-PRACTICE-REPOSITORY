

public class charAt {
    public static void main(String[] args) {
         String name = "Leelambika R";
         System.out.println(name.charAt(0));
         printLetters(name);
    }
    public static void printLetters(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i) + " ");

        }
        System.out.println();
    }
}
   
    
    

