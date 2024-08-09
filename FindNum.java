public class FindNum{
// prepare a logic to find out numbers in a string and print them
  // Ex if we take Java12Script
  // output should be like
  // 1
  // 2
    public static void findNumbersInString(String str) {
        // Traverse each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Print the digit
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Java12Script"; // Example input
        findNumbersInString(input);
    }

}
