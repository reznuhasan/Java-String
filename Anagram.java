import java.util.Scanner;
class Anagram{
    public static String Sorted(char[] chk){
        for(int i=0;i<chk.length-1;i++){
            for(int j=i+1;j<chk.length;j++){
                if(chk[i]>chk[j]){
                    char temp=chk[i];
                    chk[i]=chk[j];
                    chk[j]=temp;
                }
            }
        }
        String text="";
        for(int i=0;i<chk.length;i++){
            text=text+chk[i];
        }
        return text;
    } 
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your First String:");
        String str1=sc.nextLine();
        char arr2[]=new char[str1.length()];
        str1=str1.replaceAll("\\s", "");
        str1=str1.toUpperCase();
        for(int i=0;i<str1.length();i++){
            arr2[i]=str1.charAt(i);
        }
        String first=Sorted(arr2);
        System.out.print("Enter Your First String:");
        String str2=sc.nextLine();
        char arr[]=new char[str2.length()];
        str2=str2.replaceAll("\\s", "");
        str2=str2.toUpperCase();
        for(int i=0;i<str2.length();i++){
            arr[i]=str2.charAt(i);
        }
        String second=Sorted(arr);
        System.out.println(first);
        System.out.println(second);
        if(first.equals(second)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    
    }
}