class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        ArrayList<Integer> ans = new ArrayList<>();
         if(left(nums, target, low, high) == -1){
             return ans;
         }
        for(int i = left(nums, target, low, high); i <= right(nums, target, low, high); i++){
            ans.add(i);
        }
        return ans;
    }
    public int left(int[] nums, int target, int low, int high){
        int indexLeft = -1;
        while(low <= high){
            int mid = low +(high-low)/2;
            if(nums[mid] == target){
                indexLeft = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
            
        }
        return indexLeft;
    }
        
    public int right(int[] nums, int target, int low, int high){
        int indexRight = -1;
        while(low <= high){
            int mid = low +(high-low)/2;
            
            if(nums[mid] == target){
                indexRight = mid;
                low = mid + 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
           
        }
         return indexRight;
    }
}