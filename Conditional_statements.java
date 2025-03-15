public class Conditional_statements {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        int n3 = 8;
//        if(n1>n2)
//            System.out.println("n1 is bigger");
//        else
//            System.out.println("n2 is bigger");
//        if(n1>n2 && n1>n3)
//            System.out.println("n1 is bigger");
//        else if(n2>n1 && n2>n3)
//            System.out.println("n2 is bigger");
//        else
//            System.out.println("n3 is bigger");
        int result = (n1 > n2) ? n1 : n2;      //TERNARY OPERATORS
        System.out.println(result);
    }
}
