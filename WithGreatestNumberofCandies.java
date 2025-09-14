class WithGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();

        int maxCandies = 0; 
        for (int candy = 0; candy < candies.length; candy++) { 
            if (candies[candy] > maxCandies) {
                maxCandies = candies[candy];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int totalCandies = candies[i] + extraCandies;
            if (maxCandies <= totalCandies) {
                output.add(true);
            } else {
                output.add(false);
            }
        }

        System.out.println(output);
        return output;
    } 
} 
