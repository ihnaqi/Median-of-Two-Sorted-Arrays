
public class App {

    public double findMedianSortedArrays(int[] array1, int[] array2) {
        int counter1 = 0;
        int counter2 = 0;
        int index = 0;
        int[] result_array = new int[array1.length + array2.length];
        if (result_array.length == 0) {
            return Integer.MIN_VALUE;
        }
        while (counter1 < array1.length || counter2 < array2.length) {
            if (counter1 > (array1.length - 1)) {
                result_array[index] = array2[counter2];
                counter2++;
                index = index + 1;
            } else if (counter2 > (array2.length - 1)) {
                result_array[index] = array1[counter1];
                counter1++;
                index = index + 1;
            } else {
                if (array1[counter1] < array2[counter2]) {
                    result_array[index] = array1[counter1];
                    counter1++;
                    index = index + 1;
                } else {
                    result_array[index] = array2[counter2];
                    counter2++;
                    index = index + 1;
                }
            }
        }
        double median = -1;
        if (result_array.length % 2 == 1) {
            median = (double) result_array[result_array.length / 2];
            return median;
        } else {
            median = ((double) result_array[result_array.length / 2]
                    + (double) result_array[(result_array.length / 2) - 1]) / 2;
            return median;
        }
    }

}
