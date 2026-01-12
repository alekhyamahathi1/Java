class sol334 {
    public boolean increasingTriplet(int[] nums) {
        int size = nums.length ;
        boolean output = false;
        int BEFORENUM = Integer.MAX_VALUE;
        int AFTERNUM = Integer.MAX_VALUE;

        for ( int i = 0; i < size; i++) {
            if (nums[i] <= BEFORENUM) {
                BEFORENUM = nums[i];
                }

            else if (nums[i] <= AFTERNUM) {
                AFTERNUM = nums[i];
                }

            else { 
                output = true;
                }

        }

        return output;
    }
        
}
