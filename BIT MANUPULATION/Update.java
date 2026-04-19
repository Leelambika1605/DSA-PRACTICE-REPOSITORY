public class Update {
    public static void main(String[] args) {
        System.out.println(Update(10, 3, 1));
    }
    public static int Update(int n , int i , int newBit){
        // if(newBit == 0){
        //     return ClearIthBit(n,i);
        // }else{
        //     return SetIthBit(n,i);
        // }

        n = ClearIthBit(n, i);
        int bitMask = newBit << i;

    }
       public static int ClearIthBit(int n , int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
      public static int SetIthBit(int n , int i){
        int bitMask =  1 << i;
        return n | bitMask;
    }
}
