public class Type_conversion {
    public static void main(String[] args){
         byte a=25;
         int b=345;
         a=(byte)b;   //EXPLICIT - TYPE CASTING
//         b=a;        //IMPLICIT - TYPE CASTING
        float f=5.6f;
        int t=(int)f;
//        System.out.println(a + " " + b);
        System.out.println(f + " " + t);
    }
}
