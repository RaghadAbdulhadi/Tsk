public class SumOfEvenNumbers {
    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number; // Add the even number to the sum
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfEvenNumbers = calculateSumOfEvenNumbers(numbers);

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
}
