package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {

private Queue<Integer> queue;

public QueueOperations() {
queue = new LinkedList<>();
}

public void enqueue(int value) {
queue.offer(value);
System.out.println(value + " added to queue.");
}

public void dequeue() {

if (isEmpty()) {
System.out.println("Queue is empty.");
return;
}

System.out.println("Removed: " + queue.poll());
}

public void peek() {

if (isEmpty()) {
System.out.println("Queue is empty.");
return;
}

System.out.println("Front Element: " + queue.peek());
}

public void display() {

if (isEmpty()) {
System.out.println("Queue is empty.");
return;
}

System.out.println(queue);
}
public boolean isEmpty() {
return queue.isEmpty();
}
}
