/**
 * program
 */
class program{
    public static void main(String[] args)
{
    int count = 0;
    Integer[] nums = {1,2,1,2,-1,1,3,1,3,-1,0};
    Integer[] newList = {};
    
    for (int i = 1; i < nums.length; i++) 
    {
        if ((nums[i] < 0) && (nums[i-1] > 0)); 
        {
            newList.append(nums[i-1]);
        }
    };
    
    for (int i = 0; i < newList.length; i++) 
    {
        int sum = 0;
        sum +=  newList[i];
        System.out.print(sum);
    };
}
}
