class MinStack {

//brute force
/*
  private Stack<Integer> stack;
    public MinStack() {
        stack=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> tmp=new Stack<>();
        int min=stack.peek();
        while (!stack.isEmpty()){
            min=Math.min(min,stack.peek());
            tmp.push(stack.pop());
        }
        while (!tmp.isEmpty()){
            stack.push(tmp.pop());
        }
        return min;
    }
    */

    //2 stack
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
