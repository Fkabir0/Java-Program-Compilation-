import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        long decimalNumber = scanner.nextLong();

        if (decimalNumber < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int[] binaryArray = convertToBinary(decimalNumber);

            System.out.println("Binary representation: ");
            for (int i = binaryArray.length - 1; i >= 0; i--) {
                System.out.print(binaryArray[i]);
            }
        }
        scanner.close();
    }
    private static int[] convertToBinary(long decimalNumber) {

        int numBits = (int) Math.ceil(Math.log(decimalNumber + 1) / Math.log(2));
        int[] binaryArray = new int[numBits];

        for (int i = 0; i < numBits; i++) {
            binaryArray[i] = (int) (decimalNumber % 2);
            decimalNumber /= 2;
        }

        return binaryArray;
    }
}

