class node {
    Object value; // Stores the value of the node
    node next;    // Points to the next node in the list

    // Constructor to initialize the node with a value
    public node(Object value) {
        this.value = value;
        next = null; // The next reference is null by default
    }
}

// Queue implementation using linked list
public class QueueNode {
    node first; // Points to the first node (front of the queue)
    node last;  // Points to the last node (rear of the queue)
    int count;  // Tracks the number of elements in the queue

    // Constructor to initialize an empty queue
    public QueueNode() {
        first = null; // No elements, so first is null
        last = null;  // No elements, so last is null
        count = 0;    // The count of elements is zero
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return first == null && last == null; // If both first and last are null, queue is empty
    }

    // Adds an element to the rear of the queue
    public boolean Enqueue(Object value) {
        node newNode = new node(value); // Create a new node with the given value
        if (isEmpty()) {               // If the queue is empty
            first = newNode;           // Set first to the new node
            last = newNode;            // Set last to the new node
        } else {                       // If the queue is not empty
            last.next = newNode;       // Link the new node to the current last node
            last = newNode;            // Update last to the new node
        }
        count++; // Increment the count of elements in the queue
        return true; // Indicate that the operation was successful
    }

    // Removes an element from the front of the queue
    public boolean Dequeue() {
        if (!isEmpty()) {             // If the queue is not empty
            if (first == last) {      // If there's only one element
                first = null;         // Set first to null
                last = null;          // Set last to null
            } else {                  // If there are multiple elements
                first = first.next;   // Move first to the next node
            }
            count--; // Decrement the count of elements in the queue
            return true; // Indicate that the operation was successful
        } else {                      // If the queue is empty
            return false; // Dequeue operation fails
        }
    }

    // Retrieves the value of the first element without removing it
    public Object getFirst() {
        if (!isEmpty()) {             // If the queue is not empty
            return first.value;       // Return the value of the first node
        } else {                      // If the queue is empty
            return null; // Return null
        }
    }

    // Retrieves the value of the last element without removing it
    public Object getLast() {
        if (!isEmpty()) {             // If the queue is not empty
            return last.value;        // Return the value of the last node
        } else {                      // If the queue is empty
            return null; // Return null
        }
    }

    // Displays the elements of the queue
    public void display() {
        if (!isEmpty()) {             // If the queue is not empty
            node temp = first;        // Start at the first node
            while (temp != null) {    // Traverse until the end of the list
                System.out.print("[" + temp.value + "]-->"); // Print the current node's value
                temp = temp.next;     // Move to the next node
            }
            System.out.println();     // Print a new line after the queue
        } else {                      // If the queue is empty
            System.out.println("Queue is Empty..."); // Print a message indicating it's empty
        }
    }

    // Returns a string representation of the queue
    public String toString() {
        String result = "";           // Initialize an empty string
        if (!isEmpty()) {             // If the queue is not empty
            result += "first = [" + first.value + "]\n"; // Add the value of the first element
            result += "last  = [" + last.value + "]\n";  // Add the value of the last element

            node temporary = first;   // Start at the first node
            while (temporary != null) { // Traverse the list
                result += "[" + temporary.value + "]->"; // Add each node's value to the string
                temporary = temporary.next; // Move to the next node
            }
            result += "\n"; // Add a new line at the end
        }
        return result; // Return the string representation of the queue
    }
}