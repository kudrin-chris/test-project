import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int l = 0; l < t; l++){
            int n = scanner.nextInt();
            int x1, x2, x3;
            int l1, l2, l3;
            int max = -1;
            for(int i = 2; i < n / 2; i++){
                for(int j = i + 2; j < n - 1; j++){

                    l1 = j - i; //длины
                    l2 = n - j < j ? (n - j) : (j);
                    l3 = n - i < i? (n - i) : (i);

                    x1 = (l1 - l2 > 0 ? l1 - l2 : l2 - l1);
                    x2 = (l2 - l3 > 0 ? l2 - l3 : l3 - l2);
                    x3 = (l3 - l1 > 0 ? l3 - l1 : l1 - l3);

                    if(x1 > x2){x1 = x2;}
                    if(x1 > x3){x1 = x3;}
                    if(max < x1){max = x1;}
                }
            }
            System.out.println(max);
        }
    }
}