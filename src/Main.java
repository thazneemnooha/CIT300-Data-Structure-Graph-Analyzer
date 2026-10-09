import array.ArrayOperations;
import searching.SearchingOperations;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println(" DATA STRUCTURE & GRAPH ANALYZER ");
        System.out.println("==================================");

        ArrayOperations array = new ArrayOperations();

        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);

        array.display();

        SearchingOperations search = new SearchingOperations();

        int linearResult =
                search.linearSearch(
                        array.getArray(),
                        array.getSize(),
                        30);

        System.out.println("\nLinear Search Result: "
                + linearResult);

        System.out.println("Linear Steps: "
                + search.getLinearSteps());

        int binaryResult =
                search.binarySearch(
                        array.getArray(),
                        array.getSize(),
                        30);

        System.out.println("\nBinary Search Result: "
                + binaryResult);

        System.out.println("Binary Steps: "
                + search.getBinarySteps());
    }
}