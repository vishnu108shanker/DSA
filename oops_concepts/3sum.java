class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums) ;
     List<List<Integer>> list = new ArrayList<>() ;
        for(int i = 0 ; i <= nums.length-3 ; i++ ){
            if(i > 0 && nums[i] == nums[i-1]) continue;
                    int sum = 0-nums[i] ;

            int low = i+1 ; 
            int high = nums.length-1 ;

            while(low < high ){
                if(nums[low] + nums[high] < sum ) low++ ;
                else if (nums[low] + nums[high] > sum) high-- ;
                else {
                    List<Integer> lt = new ArrayList<>() ;
                            list.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // After finding a triplet, skip duplicates
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
            }
            
        }
        
    }
        return list ;
}
}
