public class VariableDemo {
    public static void main(String[] args) {
        // ─────────────────────────────────────────
        // INTEGER TYPES
        // ─────────────────────────────────────────
        // byte: for very small numbers (age, floor number)
        byte age = 25;
        byte floorNumber = 10;
        // short: for small n
        short year = 2024;
        short portNumber = 8080;
        // int: the most commonly used number type
        int salary = 75000;
        int population = 1400000000; // India's population
        // long: for very large numbers
        // Notice the 'L' at the end — required for long literals
        long distanceToSun = 149600000L; // in kilometers
        long worldPopulation = 8000000000L;
        // ─────────────────────────────────────────
        // DECIMAL TYPES
        // ─────────────────────────────────────────
        // float: less precise decimal
        // Notice the 'f' at the end — required for float literals
        float temperature = 36.6f;
        float piApprox = 3.14f;
        // double: more precise decimal (DEFAULT for decimals)
        double precisePI = 3.14159265358979;
        double bankBalance = 1250750.75;
        // ─────────────────────────────────────────
        // CHARACTER TYPE
        // ─────────────────────────────────────────
        // char: stores a SINGLE character, uses SINGLE quotes
        char grade = 'A';
        char symbol = '@';
        char digit = '7'; // This is the CHARACTER '7', not the NUMBER 7
        // ─────────────────────────────────────────
        // BOOLEAN TYPE
        // ─────────────────────────────────────────
        // boolean: only true or false
        boolean isLoggedIn = true;
        boolean hasPaid = false;
        boolean isEligible = true;
        // ─────────────────────────────────────────
        // PRINTING VARIABLES
        // ─────────────────────────────────────────
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Bank Balance: " + bankBalance);
        System.out.println("Grade: " + grade);
        System.out.println("Is Logged In: " + isLoggedIn);
    }
}