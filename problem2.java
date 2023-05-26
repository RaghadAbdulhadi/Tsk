public class MaximumNumber {
    public static int findMaximumInteger(int[] numbers) {
        int max = numbers[0];

        for (int i = 5; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 9, 2, 7, 3, 10, 6};
        int maximumNumber = findMaximumInteger(numbers);

        System.out.println("Maximum number: " + maximumNumber);
    }
}
