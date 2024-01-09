/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String oldStr) {
        // Define "newStr" which we will add to to make the string without repeats
        String newStr = "";

        // Define boolean "repeatChar" which will become true if the program detects that there is a repeat character
        boolean repeatChar;

        for (int i = 0; i < oldStr.length(); i++) {
            // Initialize repeatChar to false at the start of each loop
            repeatChar = false;

            // Set currentChar to be the i'th character in the original string
            char currentChar = oldStr.charAt(i);
    
            //System.out.println(i + ": " + currentChar);

            // In this second loop we check for duplicates.
            // To make sure there are no duplicates, the nested loop will loop through the new string to see if it already 
            // contains that character. If it does, repeatChar is ticked true.
            for (int j = 0; j < newStr.length() && newStr.length() > 0; j++) {
                if (currentChar == newStr.charAt(j)) {
                    repeatChar = true;
                }
            }

            // If repeatChar is ticked true, it does not add the i'th character to the new string.
            // If the current character is space, then it will add the i'th character anyway.
            // 32 is space in ASCI
            if ((repeatChar == false) || (currentChar == 32)) {
                newStr = newStr + currentChar;
            }
        }
        return newStr;
    }
}