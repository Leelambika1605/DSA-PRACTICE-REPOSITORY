public class LargestString {
    //lexico graphically (built in function)
    public static void main(String[] args) {
        
    
    String fruits[] = {"Apple" , "banana" , "mango"};
    String largest = fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
        }
    }
    System.out.println(largest);
    }
}

// 0 -> equal
// -ve -> str1 greater than str2
// +ve -> str1 lesser than str2