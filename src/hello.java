public class hello {
    int a = 10;
    int b = 4;

    void add() {
        System.out.println("The addition is: " + (a + b));
    }
    void mult(){
        System.out.println("The product is: "(a * b));
    }

    public static void main(String[] args) {
        hello obj = new hello();
        obj.add();
        obj.mult();
    }
}