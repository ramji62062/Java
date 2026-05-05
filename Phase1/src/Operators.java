public class Operators {
    //1. Arithematic operators
        public static void main(String[] args) {
            int a = 17;
            int b = 5;
            System.out.println("a + b = " + (a + b)); // 22 (Addition)
            System.out.println("a - b = " + (a - b)); // 12 (Subtraction)
            System.out.println("a * b = " + (a * b)); // 85 (Multiplication)
            System.out.println("a / b = " + (a / b)); // 3 (Division — INTEGER division!)
            System.out.println("a % b = " + (a % b)); // 2 (Modulo — REMAINDER)
            // CRITICAL: Integer division truncates (cuts off) decimal part
            // 17 / 5 = 3.4 in math, but Java gives 3 (not 3.4!)
            // This is one of the most common beginner bugs!
            // To get decimal result, use double:
            double result = (double) a / b;
            System.out.println("Decimal division: " + result); // 3.4
            // MODULO use case — finding if a number is even or odd
            int number = 17;
            System.out.println(number + " % 2 = " + (number % 2));
            // If result is 0 → even, if result is 1 → odd
            // 17 % 2 = 1 → odd ✓

            // 2.A ssignment opertors

                    int x = 10; // Basic assignment
                    // Compound assignment operators (shorthand)
                    x += 5; // Same as: x = x + 5 → x is now 15
                    System.out.println("After += 5: " + x); // 15
                    x -= 3; // Same as: x = x - 3 → x is now 12
                    System.out.println("After -= 3: " + x); // 12
                    x *= 2; // Same as: x = x * 2 → x is now 24
                    System.out.println("After *= 2: " + x); // 24
                    x /= 4; // Same as: x = x / 4 → x is now 6
                    System.out.println("After /= 4: " + x); // 6
                    x %= 4; // Same as: x = x % 4 → x is now 2
                    System.out.println("After %= 4: " + x); // 2

            //3. Increment and Decrement Operators

                    int h = 5;
                    // PRE-INCREMENT: increment FIRST, then use the value
                    int d = ++h; // a becomes 6, then b = 6
                    System.out.println("Pre-increment: h=" + h + ", d=" + d); // a=6, b=6
                    // Reset
                    h = 5;
                    // POST-INCREMENT: use the value FIRST, then increment
                    int z = h++; // c = 5 (original value), then a becomes 6
                    System.out.println("Post-increment: =" + h + ", z=" + z); // a=6, c=5
                    // Same logic applies to -- (decremenht)
                    int e = 10;
                    System.out.println(--e); // 9 (pre-decrement)
                    System.out.println(e--); // 9 (post-decrement, x becomes 8 after)
                    System.out.println(e); // 8
                }
            }


