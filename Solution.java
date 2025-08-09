import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution{
    public int[] topKFrequent(int[] nums,int k){
        if(k == nums.length){
            return nums;
        }
        Map<Integer,Integer>count = new HashMap<>();
        for (int n:nums){
            count.put(n,count.getOrDefault(n,0) +1);

        }
        Queue   <Integer heap = new PriorityQueue<>((a,b)->count.get(a)-count.get(b));
        
    }
}
