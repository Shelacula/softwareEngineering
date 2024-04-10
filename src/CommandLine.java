// This has been implemented into ENGINECLIENT
// import java.util.Scanner;
// import java.util.concurrent.TimeUnit;

// import io.grpc.Grpc;
// import io.grpc.InsecureChannelCredentials;
// import io.grpc.ManagedChannel;

// public class CommandLine{
//     public static void main(String[] args) throws InterruptedException{
//       //connect to the compute engine
//       EngineClient client;
//       String target = "localhost:50051"; 
//       ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
//       .build();

// 	    try {
// 	      client = new EngineClient(channel);
// 	    } finally {
// 	      channel.shutdownNow().awaitTermination(60, TimeUnit.SECONDS);
// 	    }

//       //input variables
//       String inputPath = "";
//       String outputPath = "";
//       int[] integers;
//       String delimiter;
//       boolean isDelimiter;
  
//       Scanner sc = new Scanner(System.in);
// 		  int input = getInput(sc);

//         if(input == 1){
//             inputPath = getFileInput(sc);
//             System.out.println("File imported: " + inputPath);
//         }else if(input == 2){
// 			integers = getIntegerInput(sc);
// 			System.out.print("Integers imported: ");
// 			for(int i : integers){
// 				System.out.print(i + " ");
// 			}
// 			System.out.println();
// 		}

//         outputPath = getOutputFile(sc);
		
// 		delimiter = getCustomDelimiter(sc);
//         if(delimiter != null){
//             System.out.println("Your custom delimiter: " + delimiter);
//             isDelimiter = true;
//         }else{
//             System.out.println("No custom delimiter entered");
//             isDelimiter = false;
//         }

//         if(!isDelimiter && !inputPath.isEmpty()){
//           System.out.println("Starting computation with no delimiter");
//           client.compute(inputPath, outputPath);
//         } else if(!inputPath.isEmpty()) {
//           client.compute(inputPath, outputPath, delimiter);
//           System.out.println("Starting computation with a delimiter");
//         }

//     }

//     private static int getInput(Scanner sc) {
//         while(true){
//           System.out.println("Choose input type:");
//           System.out.println("1: File Location or 2: Integer List");
//           System.out.print("Enter your choice (1 or 2): ");
//           String choice = sc.nextLine();
//           if(choice.equals("1") || choice.equals("2")) {
//               return Integer.parseInt(choice);
//           }else{
//               System.out.println("Invalid option entered. Please enter 1 or 2.");
//           }
//         }
//     }

//     private static String getFileInput(Scanner sc) {
//         System.out.print("Enter the input file location: ");
//         return sc.nextLine();
//     }

//     private static String getOutputFile(Scanner sc){
//         System.out.print("Enter an output location: ");
//         return sc.nextLine();
//     }

//     private static int[] getIntegerInput(Scanner sc) {
//         System.out.print("Enter a list of integers. Separate it with commas: ");
//         String ints = sc.nextLine();
//         String[] integerStrings = ints.split(",");
//         int[] integers = new int[integerStrings.length];
//         for (int i = 0; i < integerStrings.length; i++) {
//             integers[i] = Integer.parseInt(integerStrings[i]);
//         }
//         return integers;
//     }

//     private static String getCustomDelimiter(Scanner sc) {
//         System.out.print("Do you want to enter a custom delimiter character? Yes or No?: ");
//         String choice = sc.nextLine();
//         if (choice.equalsIgnoreCase("yes")) {
//             System.out.print("Enter the custom delimiter character: ");
//             return sc.nextLine();
//         } else {
//             return null;
//         }
//     }
// }