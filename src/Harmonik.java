public class Harmonik {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1/(numbers[i]);
        }

        System.out.println(numbers.length/sum);
        // sağlama
        int a=5/((1/2+1/3+1/4+1/5)+1);
        System.out.println(a);
    }
}
