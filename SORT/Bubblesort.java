public class Bubblesort {

    public static void  bubblesort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]<nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
       int nums[] = {2,3,6,1,8,4};
       bubblesort(nums);
       printArr(nums);
    }
    
}
