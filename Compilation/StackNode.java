class StackNode {
    String data;
    StackNode tail;
    
    public StackNode(String data) {
        this.data = data;
        tail = null;
    }
}

class StackList {
    private StackNode head;
    private int count;
    
    public StackList() {
        head = null;
        count = 0;
    }
    
    private boolean isEmpty() {
        return count == 0;
    }
    
    public boolean push(String data) {
        StackNode node = new StackNode(data);
        
        node.tail = head;
        head = node;
        count++;
        return true;
    }
    
    public boolean pop() {
        if (!isEmpty()) {
            head = head.tail;
            count--;
            return true;
        }
        return false;
    }
    
    public String peek() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }
    
    public int getCount() {
        return count;
    }
    
    public void display() {
        if (!isEmpty()) {
            StackNode temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.tail;
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty....");
        }
    }
}