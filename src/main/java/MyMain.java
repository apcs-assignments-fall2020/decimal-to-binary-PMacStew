import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int computer = Integer.parseInt(binary);
        int num = 0;
        int count = 1;
        while (computer != 0) {
            num += (computer % 10) * count;
            computer /= 10;
            count += count;
        }
        return num;

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scan.next();
        System.out.println("The value of your binary number is " + binaryToDecimal(binary));
    }
}
