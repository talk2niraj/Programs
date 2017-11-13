class Bar {
    static void staticMethod() {
        System.out.println("Static Method");
    }
}
 public class MainClass {
    public static void main(String[] args) {
    	Bar a = null;
        a.staticMethod();
    }
}
