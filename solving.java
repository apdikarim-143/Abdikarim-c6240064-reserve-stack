package Assingment1;

public class solving {

        public static int[] reverseArray(int[] numbers) {

            ArrayStack<Integer> stack = new ArrayStack<>(2);

            for (int number : numbers) {
                stack.push(number);
            }

            int[] reversed = new int[numbers.length];

            int i = 0;

            while (!stack.isEmpty()) {
                reversed[i] = stack.pop();
                i++;
            }

            return reversed;
        }

        static class ArrayStack<T> {
            private T[] stack;
            private int top;

            @SuppressWarnings("unchecked")
            public ArrayStack(int capacity) {
                top = 0;
                stack = (T[]) new Object[capacity];
            }

            public void push(T element) {
                if (top == stack.length) {
                    stack = java.util.Arrays.copyOf(
                            stack, stack.length * 2
                    );
                }

                stack[top] = element;
                top++;
            }

            public T pop() {
                if (isEmpty()) {
                    return null;
                }

                top--;
                T removed = stack[top];
                stack[top] = null;

                return removed;
            }

            public boolean isEmpty() {
                return top == 0;
            }
        }
    }


