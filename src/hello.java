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

    void print(){
        System.out.println("i will put this in GitHub");
    }

    public static void main(String[] args) {
        hello obj = new hello();
        obj.add();
        obj.mult();
    }
}