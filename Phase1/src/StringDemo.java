public class StringDemo {
    public static void main(String[] args) {
        // String is NOT a primitive — it's a class (we'll learn why in Phase 2)
        // But you use it constantly, so learn it now
        // String stores text of ANY length
        // Uses DOUBLE quotes
        String firstName = "Ravi";
        String lastName = "Kumar";
        String city = "Mumbai";
        String message = "I am learning Java and it's amazing!";
        // String CONCATENATION (joining strings together)
        // The + operator joins strings
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        // You can also join strings with numbers
        int myAge = 25;
        System.out.println("My name is " + firstName + " and I am " + myAge + " years old.");
        // String length — how many characters
        System.out.println("Name length: " + firstName.length()); // 4
        // Uppercase and Lowercase
        System.out.println(firstName.toUpperCase()); // RAVI
        System.out.println(firstName.toLowerCase()); // ravi
    }
}