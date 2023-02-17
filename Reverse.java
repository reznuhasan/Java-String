import java.util.Scanner;
class Reverse{
    public static void main(String[] args){
        // Case1:
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your Case1:");
        // String cs1=sc.next();
        // String solve="";
        // for(int i=cs1.length()-1;i>=0;i--){
        //     solve+=cs1.charAt(i);
        // }
        // System.out.println(solve);

        // Case 2
        // sc.nextLine();
        System.out.print("Enter your Case2: ");
        String cs2=sc.nextLine();
        String solve1="";
        String word="";
        for(int i=0;i<cs2.length();i++){
            if(cs2.charAt(i)!=' '){
                word+=cs2.charAt(i);
            }
            else{
                solve1=word+" "+solve1;
                word="";
            }
        }
        solve1=word+" "+solve1;
        System.out.println(solve1);


    }
}