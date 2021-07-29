import java.util.Scanner;

public class parity {

    public static void nom(String[] args){
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
        int z = src.nextInt();
        if (((x + y + z) % 2 != 0) && (z % 2 == 0)){
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
