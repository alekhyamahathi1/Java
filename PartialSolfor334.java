class PartialSolfor334 {
    public boolean increasingTriplet(int[] nums) {
        int size = nums.length ;
        boolean output = false;
        for ( int i = 1; i < size-1; i++) {
            if (nums[i]>nums[i-1] & nums[i]<nums[i+1]) {
                output = true;
            } else {continue;}
            break;
        }
        return output;}
        
    }
