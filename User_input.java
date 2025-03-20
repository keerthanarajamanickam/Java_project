import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User_input {
    public static void main(String[] args) throws IOException {

//        System.out.println("Enter a number: ");

//        InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(in);
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

//        int num=Integer.parseInt(br.readLine());
//        System.out.println(num);

//        sc.close();

        /* TRY WITH RESOURCES*/
        int num=0;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }


    }
}
