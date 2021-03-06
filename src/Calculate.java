public class Calculate {
    public static int multiplicity() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int k = 3;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % k == 0) {
                count = array[i] + count;
            }
        }
        return count;
    }
}