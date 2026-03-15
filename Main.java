import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "abcd";
        String str1 = new String("xyz");

        //Strings are immutable
        Scanner sc = new Scanner(System.in);
        String name ;
        name = sc.nextLine();
        System.out.println(name);

        //length of string
        String fullname = "Leelambika R";
        System.out.println(fullname.length());

        //concatrnation 
        String first = "leela";
        String last = "R";
        String fullname1 = first + " " + last;
        System.out.println(fullname1);
    }
 }