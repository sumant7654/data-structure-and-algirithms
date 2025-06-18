public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack created with size " + size);
    }

    public boolean isEmpty(){
        return topOfStack == -1;
    }

    public boolean isFull(){
        return topOfStack == arr.length - 1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++topOfStack] = value;
        System.out.println("Stack pushed " + value);

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[topOfStack--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[topOfStack];
    }

    public void delete(){
        arr = null;
        topOfStack = -1;
        System.out.println("Stack deleted");
    }

}
