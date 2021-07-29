import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
            if (((x + y)% 2 ==0) && ((x * y) % 2 != 0)){
                System.out.println("true");
            } else
                System.out.println("false");
    }
}
