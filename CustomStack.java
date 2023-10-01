/**
 * CustomStack<T> is a generic stack data structure implementation in Java.
 * It provides a last-in, first-out (LIFO) collection of items.
 *
 * @param <T> The type of elements stored in the stack.
 */
public class CustomStack<T> {
    private Object[] items; // Internal array to store stack elements.
    private int top;        // Index of the top element in the stack.

    /**
     * Initializes a new instance of the CustomStack class with a specified initial size.
     *
     * @param size The initial size of the stack.
     */
    public CustomStack(int size) {
        items = new Object[size];
        top = -1;
    }

    /**
     * Initializes a new instance of the CustomStack class with a default initial size of 10.
     */
    public CustomStack() {
        this(10);
    }

    /**
     * Pushes an item onto the stack.
     *
     * @param item The item to be pushed onto the stack.
     * @return The item that was pushed.
     */
    public T push(T item) {
        if (top == items.length - 1) {
            resize();
        }
        items[++top] = item;
        return item;
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return The item at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) items[top];
        items[top--] = null;
        return item;
    }

    /**
     * Returns the item at the top of the stack without removing it.
     *
     * @return The item at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) items[top];
    }

    /**
     * Doubles the size of the internal array when the stack is full.
     */
    private void resize() {
        Object[] newItems = new Object[items.length * 2];
        System.arraycopy(items, 0, newItems, 0, newItems.length);
        items = newItems;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return The number of elements in the stack.
     */
    public int size() {
        return top + 1;
    }

    /**
     * Removes all elements from the stack.
     */
    public void clear() {
        for (int i = 0; i <= top; i++) {
            items[i] = null;
        }
        top = -1;
    }

    /**
     * Searches for the specified item in the stack and returns its 1-based position.
     *
     * @param item The item to search for in the stack.
     * @return The 1-based position of the item in the stack, or -1 if not found.
     */
    public int search(T item) {
        for (int i = top; i >= 0; i--) {
            if (items[i].equals(item)) {
                return top - i + 1;
            }
        }
        return -1;
    }
}
