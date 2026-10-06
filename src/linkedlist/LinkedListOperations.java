package linkedlist;

public class LinkedListOperations {

private Node head;

public void insert(int value) {

Node newNode = new Node(value);

if (head == null) {
head = newNode;
return;
}

Node temp = head;

while (temp.next != null) {
temp = temp.next;
}

temp.next = newNode;
}

public void delete(int value) {

if (head == null) {
System.out.println("List is empty.");
return;
}

if (head.data == value) {
head = head.next;
return;
}

Node current = head;

while (current.next != null &&
current.next.data != value) {
current = current.next;
}

if (current.next == null) {
System.out.println("Element not found.");
return;
}

current.next = current.next.next;
}

public boolean search(int value) {

Node temp = head;

while (temp != null) {

if (temp.data == value) {
return true;
}

temp = temp.next;
}

return false;
}

public void display() {

if (head == null) {
System.out.println("List is empty.");
return;
}

Node temp = head;

while (temp != null) {

System.out.print(temp.data + " -> ");

temp = temp.next;
}
System.out.println("NULL");
}
}
