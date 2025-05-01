package stacks;


import java.util.Stack;

public class MaxItemStack {
    // this is the original stack
    private Stack<Integer> mainStack;
    // this is just for tracking the maximum item
    private Stack<Integer> maxStack;

    public MaxItemStack() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int item) {
        // push the new item onto the stack
        mainStack.push(item);

        // first item is the same in both stacks
        if(mainStack.size() == 1) {
            maxStack.push(item);
            return;
        }

        // if the item is the largest one so far: we insert it onto the stack
        if(item > maxStack.peek()) {
            maxStack.push(item);
        } else {
            // if not the largest one then we duplicate the largest one on the stack
            maxStack.push(maxStack.peek());
        }
    }

    // when removing an item we remove it from both stacks
    public int pop() {
        maxStack.pop();
        return mainStack.pop();
    }

    // max item is the last item we have inserted into the stack O(1)
    public int getMaxItem() {
        return maxStack.peek();
    }
}
