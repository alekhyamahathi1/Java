class PartialSolfor334_2 {
    public boolean increasingTriplet(int[] nums) {
        int size = nums.length ;
        boolean output = false;
        int min = 0;
        int max = 0;
        for ( int i = 1; i < size-1; i++) {

            if (nums[i]>nums[i-1] ) {
                min = nums[i-1];
                } 
            
            if (nums[i]<nums[i+1]) {
                max = nums[i+1];
                }
            
            if (nums[i] > min & nums[i] < max) {
                output = true;
            } 
        }
        return output;}
        
    }
