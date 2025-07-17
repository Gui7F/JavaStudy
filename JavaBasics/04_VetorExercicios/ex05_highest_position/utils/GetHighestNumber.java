package JavaBasics.VetorExercicios.ex05_highest_position.utils;

public class GetHighestNumber {

    public static class Result {
        public final int position;
        public final int value;

        public Result(int position, int value) {
            this.position = position;
            this.value = value;
        }
    }

    public static Result getHighestPosition(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int highestPosition = 0;
        int highestValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
                highestPosition = i;
            }
        }

        return new Result(highestPosition, highestValue);
    }
}
