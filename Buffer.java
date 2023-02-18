public class Buffer {
    public static void main(String[] args){
       final StringBuffer name=new StringBuffer();
        name.append("1234567891234567");
        System.out.println(name.capacity());
        name.append("12");
        System.out.println(name.capacity());
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        name.setCharAt(1, 'R');
        System.out.println(name);
        // name=new StringBuffer("Rupaz");
        // System.out.println(name);
        
    }
}
