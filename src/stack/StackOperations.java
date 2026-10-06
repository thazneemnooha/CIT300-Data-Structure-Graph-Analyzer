package stack;

import java.util.Stack;

public class StackOperations {

private Stack<Integer> stack;

public StackOperations() {
stack = new Stack<>();
}

public void push(int value) {
stack.push(value);
System.out.println(value + " pushed into stack.");
}

public void pop() {

if (isEmpty()) {
System.out.println("Stack is empty.");
return;
}

System.out.println("Removed: " + stack.pop());
}

public void peek() {

if (isEmpty()) {
System.out.println("Stack is empty.");
return;
}

System.out.println("Top Element: " + stack.peek());
}

public void display() {

if (isEmpty()) {
System.out.println("Stack is empty.");
return;
}

System.out.println(stack);
}

public boolean isEmpty() {
return stack.isEmpty();
}
}
