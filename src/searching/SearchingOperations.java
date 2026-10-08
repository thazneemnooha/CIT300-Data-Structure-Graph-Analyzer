package searching;

public class SearchingOperations {

    private int linearSteps;
    private int binarySteps;

    public int linearSearch(int[] arr, int size, int target) {

        linearSteps = 0;

        for (int i = 0; i < size; i++) {

            linearSteps++;

            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int[] arr, int size, int target) {

        binarySteps = 0;

        int left = 0;
        int right = size - 1;

        while (left <= right) {

            binarySteps++;

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int getLinearSteps() {
        return linearSteps;
    }

    public int getBinarySteps() {
        return binarySteps;
    }
}
