public class Logical_operators {     //AND,OR,NOT
    public static void main(String[] args){
        int a=6;
        int b=7;
        int x=10;
        int y=33;
//        boolean result=(a>b) && (x<y);     // && , || , !
//        boolean result=(a>b) || (x<y);
        boolean result=!((a>b) && (x<y));
        System.out.println(result);
    }
}
