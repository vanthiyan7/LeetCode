class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == k)
        return nums;
        Queue<int[]> minheap=new PriorityQueue<>((a,b)->{return a[0]-b[0];});
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:nums)
        map.merge(n,1,Integer::sum);
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            minheap.add(new int[] {m.getValue(),m.getKey()});
            if(minheap.size()>k)
                minheap.remove();
        }
        int[] ans=new int[k];
        int j=0;
        for(int[] i:minheap)
        {
            System.out.println(minheap.peek()[1]);
        }
        while(!minheap.isEmpty())
        {
            ans[j++]=minheap.remove()[1];
        }

        
        return ans;

    }
}