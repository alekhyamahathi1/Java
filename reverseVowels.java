class reverseVowels {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        if (s.length() > 1) {
            for (int i = s.length() - 1; i >= 0; i--) {
                for (int j = 0; j < vowels.length(); j++) {
                    if (s.charAt(i) == vowels.charAt(j)) {
                        result.append(s.charAt(i));
                    }
                }
            }
        }

        else {
            if (vowels.contains(String.valueOf(s.charAt(0)))) {
                result.append(s.charAt(0));
            }
        }
    return result.toString();

    }
}
