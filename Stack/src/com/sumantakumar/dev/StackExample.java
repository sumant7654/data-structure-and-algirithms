package com.sumantakumar.dev;

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        System.out.println("====PUSH====");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("====POP====");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("====PEEK====");
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        stack.delete();
        System.out.println("====PEEK AFTER DELETION====");
        System.out.println(stack.peek());

    }
}
