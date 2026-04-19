public class OddEven {
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(2);
        oddOrEven(19);
        

        
    }
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            //even number
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
