import java.util.Scanner;

public class FindMinOfArray {
    public static int MinValue(int[] array) {
        int min = array[0];
        int index = 0;
        for ( int i= 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = input.nextInt();
        int [] number = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter number of index "+ i + " is: ");
            number[i]=input.nextInt();
        }
        System.out.println("\tNumber list is: ");
        for(int i=0; i<number.length;i++){
            System.out.print(number[i]+ "\t");
        }
        int indexOfMin= MinValue(number);
        System.out.println();
        System.out.println("Min of input array number is: "+ number[indexOfMin]);

    }
}
