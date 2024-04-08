import java.util.Scanner;

public class CommandLine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int input = getInput(sc);
    
        if(input == 1){
            String file = getFileInput(sc);
            System.out.println("File imported: " + file);
        }else if(input == 2){
			int[] integers = getIntegerInput(sc);
			System.out.print("Integers imported: ");
			for(int i : integers){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		String delimiter = getCustomDelimiter(sc);
        if(delimiter != null){
            System.out.println("Your custom delimiter: " + delimiter);
        }else{
            System.out.println("No custom delimiter entered");
        }
    }

    private static int getInput(Scanner sc) {
        while(true){
            System.out.println("Choose input type:");
            System.out.println("1: File Location or 2: Integer List");
            System.out.print("Enter your choice (1 or 2): ");
            String choice = sc.nextLine();
            if(choice.equals("1") || choice.equals("2")) {
                return Integer.parseInt(choice);
            }else{
                System.out.println("Invalid option entered. Please enter 1 or 2.");
            }
        }
    }

    private static String getFileInput(Scanner sc) {
        System.out.print("Enter the file location: ");
        return sc.nextLine();
    }

    private static int[] getIntegerInput(Scanner sc) {
        System.out.print("Enter a list of integers. Separate it with commas: ");
        String ints = sc.nextLine();
        String[] integerStrings = ints.split(",");
        int[] integers = new int[integerStrings.length];
        for (int i = 0; i < integerStrings.length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }
        return integers;
    }

    private static String getCustomDelimiter(Scanner sc) {
        System.out.print("Do you want to enter a custom delimiter character? Yes or No?: ");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the custom delimiter character: ");
            return sc.nextLine();
        } else {
            return null;
        }
    }
}