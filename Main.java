package Assingment1;

public class Main {

        static void main() {

            int[] numbers = {10, 20, 30, 40, 50};

            int[] result = solving.reverseArray(numbers);

            System.out.print("Reversed array: ");

            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }

