class Demo{
    static void disp1(){
        System.out.println("Static Method");
    }
    void disp2(){
        System.out.println("Non Static Method");
    }
}
public class CheckStatic2 {
    public static void main(String[] args) {
        Demo.disp1();
        // Demo.disp2();
    }
}
