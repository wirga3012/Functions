public class Pagalbine {
    public int number1;

     public static int generateRnd (int min, int max){
        return min + (int)(Math.random() * (max -min + 1));
    }

    public int[] randomArr(int min, int max) {

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min));
        }
        return numbers;
    }
}

