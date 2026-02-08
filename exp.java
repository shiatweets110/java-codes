public class exp {
    public static void main(String[] args) {
                int a = 9;
                int b = 10;

        try {
            double c = (double) a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}