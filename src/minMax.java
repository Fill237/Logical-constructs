import java.util.Scanner;

public class minMax {

    public static void num(String[] args){
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
        int z = src.nextInt();
        if ((x >= y && x <= z) || (x <=y && x >= z)){
            System.out.println(x);
        } else if ((y >= x && y <= x) || (y <= x && y >=x )) {
            System.out.println(y);
        } else
            System.out.println(z);
    }
}
