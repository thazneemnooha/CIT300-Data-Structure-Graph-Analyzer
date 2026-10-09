import array.ArrayOperations;
import graph.GraphOperations;
import linkedlist.LinkedListOperations;
import performance.PerformanceAnalyzer;
import queue.QueueOperations;
import searching.SearchingOperations;
import stack.StackOperations;
import utility.InputValidator;

public class Main {

    public static void main(String[] args) {

        ArrayOperations array = new ArrayOperations();
        SearchingOperations search = new SearchingOperations();
        StackOperations stack = new StackOperations();
        QueueOperations queue = new QueueOperations();
        LinkedListOperations linkedList = new LinkedListOperations();
        GraphOperations graph = new GraphOperations();
        PerformanceAnalyzer performance = new PerformanceAnalyzer();

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println(" DATA STRUCTURE & GRAPH ANALYZER ");
            System.out.println("====================================");

            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");

            choice = InputValidator.getValidInt();

            switch (choice) {

              case 1:

    int arrayChoice;

    do {

        System.out.println("\n===== ARRAY MENU =====");

        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Display");
        System.out.println("5. Back");

        System.out.print("Enter Choice: ");

        arrayChoice = InputValidator.getValidInt();

        switch (arrayChoice) {

                case 1:

                    System.out.print("Enter Value: ");

                    int insertValue =
                            InputValidator.getValidInt();

                    array.insert(insertValue);

                    break;

                case 2:

                    System.out.print("Enter Value: ");

                    int deleteValue =
                            InputValidator.getValidInt();

                    array.delete(deleteValue);

                    break;

                case 3:

                    System.out.print("Enter Value: ");

                    int searchValue =
                            InputValidator.getValidInt();

                    int result =
                            array.search(searchValue);

                    if (result != -1) {

                        System.out.println(
                                "Found at index: "
                                        + result);
                    }
                    else {

                        System.out.println(
                                "Element not found.");
                    }

                    break;

                case 4:

                    array.display();

                    break;

                case 5:

                    System.out.println(
                            "Returning to Main Menu...");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice.");
            }

        } while (arrayChoice != 5);

        break;

            case 2:

    int stackChoice;

    do {

        System.out.println("\n===== STACK MENU =====");

        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Back");

        System.out.print("Enter Choice: ");

        stackChoice = InputValidator.getValidInt();

        switch (stackChoice) {

            case 1:

                System.out.print("Enter Value: ");

                int pushValue =
                        InputValidator.getValidInt();

                stack.push(pushValue);

                break;

            case 2:

                stack.pop();

                break;

            case 3:

                stack.peek();

                break;

            case 4:

                stack.display();

                break;

            case 5:

                System.out.println(
                        "Returning to Main Menu...");

                break;

            default:

                System.out.println(
                        "Invalid Choice.");
        }

    } while (stackChoice != 5);

    break;

              case 3:

    int queueChoice;

    do {

        System.out.println("\n===== QUEUE MENU =====");

        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Back");

        System.out.print("Enter Choice: ");

        queueChoice = InputValidator.getValidInt();

        switch (queueChoice) {

            case 1:

                System.out.print("Enter Value: ");

                int enqueueValue =
                        InputValidator.getValidInt();

                queue.enqueue(enqueueValue);

                break;

            case 2:

                queue.dequeue();

                break;

            case 3:

                queue.peek();

                break;

            case 4:

                queue.display();

                break;

            case 5:

                System.out.println(
                        "Returning to Main Menu...");

                break;

            default:

                System.out.println(
                        "Invalid Choice.");
        }

    } while (queueChoice != 5);

    break;

                case 4:

    int linkedListChoice;

    do {

        System.out.println("\n===== LINKED LIST MENU =====");

        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Display");
        System.out.println("5. Back");

        System.out.print("Enter Choice: ");

        linkedListChoice = InputValidator.getValidInt();

        switch (linkedListChoice) {

            case 1:

                System.out.print("Enter Value: ");

                int insertValue =
                        InputValidator.getValidInt();

                linkedList.insert(insertValue);

                break;

            case 2:

                System.out.print("Enter Value: ");

                int deleteValue =
                        InputValidator.getValidInt();

                linkedList.delete(deleteValue);

                break;

            case 3:

                System.out.print("Enter Value: ");

                int searchValue =
                        InputValidator.getValidInt();

                boolean found =
                        linkedList.search(searchValue);

                if (found) {

                    System.out.println(
                            "Element Found.");
                } else {

                    System.out.println(
                            "Element Not Found.");
                }

                break;

            case 4:

                linkedList.display();

                break;

            case 5:

                System.out.println(
                        "Returning to Main Menu...");

                break;

            default:

                System.out.println(
                        "Invalid Choice.");
        }

    } while (linkedListChoice != 5);

    break;

                case 5:

    System.out.println("\n===== SEARCHING MENU =====");

    System.out.print("Enter Search Value: ");

    int target =
            InputValidator.getValidInt();

    int linear =
            search.linearSearch(
                    array.getArray(),
                    array.getSize(),
                    target);

    int binary =
            search.binarySearch(
                    array.getArray(),
                    array.getSize(),
                    target);

    if (linear != -1) {

        System.out.println(
                "\nLinear Search Found at Index: "
                        + linear);

    } else {

        System.out.println(
                "\nLinear Search: Element Not Found");
    }

    if (binary != -1) {

        System.out.println(
                "Binary Search Found at Index: "
                        + binary);

    } else {

        System.out.println(
                "Binary Search: Element Not Found");
    }

    System.out.println(
            "\nLinear Search Steps: "
                    + search.getLinearSteps());

    System.out.println(
            "Binary Search Steps: "
                    + search.getBinarySteps());

    break;
case 6:

    int graphChoice;

    do {

        System.out.println("\n===== GRAPH MENU =====");

        System.out.println("1. Add Vertex");
        System.out.println("2. Add Edge");
        System.out.println("3. Display Graph");
        System.out.println("4. BFS Traversal");
        System.out.println("5. DFS Traversal");
        System.out.println("6. Back");

        System.out.print("Enter Choice: ");

        graphChoice = InputValidator.getValidInt();

        switch (graphChoice) {

            case 1:

                System.out.print("Enter Vertex: ");

                String vertex =
                        InputValidator.getValidString();

                graph.addVertex(vertex);

                break;

            case 2:

                System.out.print("Enter Source Vertex: ");

                String source =
                        InputValidator.getValidString();

                System.out.print("Enter Destination Vertex: ");

                String destination =
                        InputValidator.getValidString();

                graph.addEdge(source, destination);

                break;

            case 3:

                graph.displayGraph();

                break;

            case 4:

                System.out.print(
                        "Enter Starting Vertex: ");

                String bfsStart =
                        InputValidator.getValidString();

                graph.bfs(bfsStart);

                break;

            case 5:

                System.out.print(
                        "Enter Starting Vertex: ");

                String dfsStart =
                        InputValidator.getValidString();

                graph.dfs(dfsStart);

                break;

            case 6:

                System.out.println(
                        "Returning to Main Menu...");

                break;

            default:

                System.out.println(
                        "Invalid Choice.");
        }

    } while (graphChoice != 6);

    break;

             case 7:

    System.out.println("\n===== PERFORMANCE COMPARISON =====");

    performance.compareSearching(
            search.getLinearSteps(),
            search.getBinarySteps());

    break;

                case 8:

                    System.out.println(
                            "Program Terminated Successfully.");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice.");
            }

        } while (choice != 8);
    }
}