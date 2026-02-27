public class hello {
    int a = 10;
    int b = 4;

    void add() {
        System.out.println("The addition is: " + (a + b));
    }
    void mult(){
        int i = a * b;
        System.out.println("The product is: " + i);
    }

    public static void main(String[] args) {
        hello obj = new hello();
        obj.add();
        obj.mult();
    }
}