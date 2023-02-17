import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter your word:");
          String str=sc.next();
          int len=str.length();
          int flag=0;
          for(int i=0;i<len/2;i++){
            if(!(str.charAt(i)==str.charAt(len-1-i))){
                flag=1;
                break;
            }
          }
          if(flag==1){
            System.out.println("Not Palindrome");
          }else{
            System.out.println("Palindrome");
          }
    }
}