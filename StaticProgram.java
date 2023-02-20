class Demo{
    static int a;
    static int b;
    int c;
    int d;
    
    {
        c=100;
        d=200;
        System.out.println("Non Static called");
    }
    static{
        a=20;
        b=30;
        System.out.println("static block called");
    }
    static void disp1(){
        System.out.println("static method "+a);
        System.out.println("static method "+b);
    }
    void disp2(){
        System.out.println("non static method "+c);
        System.out.println("non static method "+d);

    }

}
public class StaticProgram {
    public static void main(String[] args) {
        Demo d=new Demo();
    }
}
