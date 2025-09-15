class ReverseVowels {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder revString = new StringBuilder();
        List<Integer> vowelIndices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                revString.append(s.charAt(i));
                vowelIndices.add(i);
            }
        }

        revString.reverse();
        char[] result = s.toCharArray();


        for (int i = 0; i < vowelIndices.size(); i++) {
            result[vowelIndices.get(i)] = revString.charAt(i);
        }
        return new String(result);
    }
}
