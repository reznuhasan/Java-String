import java.util.Arrays;
import java.util.Scanner;

public class Pangram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your first string:");
        String str=sc.nextLine();
        str=str.replace(" ","");
        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        int arr[]=new int[26];
        for(int i=0;i<ch.length;i++){
            int value=(int)ch[i]-'a';
            arr[value]++;
        }
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
               flag=1;
               break;
            }
        }
        if(flag==1){
            System.out.println("Not Pangram");
        }else{
            System.out.println("Pangram");
        }
    }
}
