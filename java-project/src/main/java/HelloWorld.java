public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Docker! This is a simple Java application.");
        
        // Simple example of a basic operation
        int a = 10;
        int b = 20;
        int sum = a + b;
        
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        
        // Print some system information
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
    }
}