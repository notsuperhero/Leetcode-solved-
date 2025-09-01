public class Solution{
    public int[] productExceptSelf(int[]nums){
    public int[]result = new int[nums.length];
    Arrays.fill(result,1);
    int pre = 1;
    int post = 1;
    for(int i = 0;i<nums.length;i++){
        result[i]=prefix;
        pre = num[i]*pre;

    }
    for(int i = nums.length-1; i>=0;i++){
        result[i] = result[i]*post;
        post = nums[i]*post;
    }
    return result;
}
}
