import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {2, 5, 31, 15, 21, 4, 16, 4, 16, 6, 21, 12, 38};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {

                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }

        //We find even number in this part

        for (int value : duplicate) {
            if ((value != 0) && (value % 2 != 1)) {
                System.out.println(value);
            }
        }

    }

    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;


    }
}
