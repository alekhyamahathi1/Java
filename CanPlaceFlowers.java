class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int size = flowerbed.length;

        if (size > 1) {

            if (flowerbed[0] == 0) {
                if (flowerbed[1] == 0) {
                    flowerbed[0] = 1;
                    count++;
                }

            }

            if (flowerbed[size - 1] == 0) {
                if (flowerbed[size - 2] == 0) {
                    flowerbed[size - 1] = 1;
                    count++;
                }

            }
        }

        else {
            if (flowerbed[0] == 0) {
                flowerbed[0] = 1;
                count++;
            }
        }

        for (int i = 1; i < size - 2; i++) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        Boolean result = false;
        if (count >= n) {
            result = true;
        }

        System.out.println(result);
        return result;

    }
}
