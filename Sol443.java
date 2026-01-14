import java.util.ArrayList;

class Sol443 {
    public int compress(char[] chars) {

        ArrayList<Character> list = new ArrayList<>();

        char a = chars[0];
        int count = 0;

        for (char ch : chars) {
            if (ch == a) {
                count++;
            } else {
                list.add(a);

                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        list.add(c);
                    }
                }

                a = ch;
                count = 1;
            }
        }

        list.add(a);
        if (count > 1) {
            for (char c : String.valueOf(count).toCharArray()) {
                list.add(c);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }

        return list.size();
    }
}
