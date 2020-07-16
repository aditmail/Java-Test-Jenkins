public class HelloTest implements PrintData {

    public static void main(String[] args) {
        HelloTest helloTest = new HelloTest();

        for (int i = 1; i <= 10; i++) {
            helloTest.print(i);
        }
    }

    @Override
    public void print(int number) {
        System.out.println("This is Data ke-" + number);
    }
}

interface PrintData {
    void print(int number);
}
