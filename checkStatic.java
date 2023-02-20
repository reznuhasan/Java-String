public class checkStatic {
    static int age;
    static{
        age=100;
        System.out.println(age);
    }
    static void disp(){
        System.out.println("Static disp method after main when we called it");
    }
    public static void main(String args[]){
        System.out.println("main method block");
    }
}
