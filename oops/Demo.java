public class Demo {
    private int x = 10;

    public void hello(){
        System.out.println("Hello");
        System.out.println(x);
    }
    {
        System.out.println("Block 1");
    }
    {
        System.out.println("Block 2");
    }
    static {
        System.out.println("Block 3 Static");
    }
    {
        System.out.println("Block 4");
    }
    static {
        System.out.println("Block 5 Static");
    }
    public static void main(String[] args) {
        // int _a = 10;
        // int $b = 20;
        // System.out.println(_a+$b);
        Demo d = new Demo();
        d.hello();
    }
}
