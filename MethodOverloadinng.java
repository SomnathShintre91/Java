public class MethodOverloadinng {
    public static void main(String[] args) {
        add();
        System.out.println(add(3, 5));
        System.out.println(add(3.5f, 6.5f));
    }

    private static void add() {
        System.out.println(4 + 5);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static float add(float a, float b) {
        return a + b;
    }
}