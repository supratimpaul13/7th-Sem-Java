public class App {
    public static void main(String[] args) {
        int values[] = { 1, 2, 3, 4, 5 };
        int result = 0;

        for (int i = 0; i < 5; i++) {
            result += values[i];
        }
        
        System.out.println("Average of the values: " + (result / 6));
    }
}
