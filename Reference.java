class Reference{
    public static void main(String[]args){
        String st="Riznu";
        String st1="Riznu";
        System.out.println(st==st1);
        String st2=new String("Riznu");
        String st3=new String("Riznu");
        System.out.println(st2==st3);
    }
}