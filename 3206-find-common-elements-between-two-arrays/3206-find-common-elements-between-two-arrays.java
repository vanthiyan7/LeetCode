class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for(int k:nums1)
            set1.add(k);
            for(int k:nums2)
            set2.add(k);

            int c1 =0;
            for(int k:nums1)
            if(set2.contains(k))
            c1++;

            int c2 =0;
            for(int k:nums2)
            if(set1.contains(k))
            c2++;
            int a[] =new int[2];
            a[0] = c1;
            a[1] = c2;
            return a;
    }
}