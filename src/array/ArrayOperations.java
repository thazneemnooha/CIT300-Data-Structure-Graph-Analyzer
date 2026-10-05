package array;

public class ArrayOperations {

    private int[] arr;
    private int size;

    public ArrayOperations() {
        arr = new int[100];
        size = 0;
    }

    // Insert element
    public void insert(int value) {

        if (size >= arr.length) {
            System.out.println("Array is full.");
            return;
        }

        arr[size] = value;
        size++;

        System.out.println(value + " inserted successfully.");
    }

    // Delete element
    public void delete(int value) {

        int index = search(value);

        if (index == -1) {
            System.out.println("Element not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println(value + " deleted successfully.");
    }

    // Search element
    public int search(int value) {

        for (int i = 0; i < size; i++) {

            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Display array
    public void display() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Return array for searching module
    public int[] getArray() {
        return arr;
    }

    // Return current size
    public int getSize() {
        return size;
    }
}