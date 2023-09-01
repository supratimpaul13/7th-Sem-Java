public class App {
    public static void main(String[] args) {

        int two_D_arr[][] = {
                { 30 },
                { 300, 500 },
                { 3000, 5000, 5000 }
        };

        for (int i = 0; i < two_D_arr.length; i++) {
            for (int j = 0; j < two_D_arr[i].length; j++) {
                System.out.print(two_D_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
