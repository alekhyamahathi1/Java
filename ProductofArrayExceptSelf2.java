class ProductofArrayExceptSelf2 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
            int product = 1;
            for (int i = 1; i < n; i++) {
                answer[0] = 1;
                answer[i] = answer[i-1]*nums[i-1];
            }
            for ( int j = n-1; j >= 0; j--) {
                answer[j] = product * answer[j];
                product *= nums[j];
            }
        
        return answer;
    }
}
