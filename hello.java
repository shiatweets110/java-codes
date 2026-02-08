public class hello {

    void unusedMethod() {
        // This method is intentionally left blank
        System.out.println("This is an unused method.");
    }
    void usedMethod() {
        System.out.println("This is a used method.");
    }
     public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.err.println("Hello, World! this is my second commit to git");
         hello obj=new hello();
         obj.unusedMethod();
            obj.usedMethod();
}
}