class sol283 {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                arr.add(nums[i]);
            }
        }

        for (int j = 0; j < count; j++) {
            arr.add(0);

        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }

    }

}
