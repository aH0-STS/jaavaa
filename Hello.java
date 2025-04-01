public class Hello {
    public static void main(String[] args) {
        while (true) {
            System.out.println("helloworld");
            try {
                Thread.sleep(5000); // Print every 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
