//class Ax{
//    public void show() throws ClassNotFoundException {
//        Class.forName("Calc");
//    }
//}

public class Exceptions {
    public static void main(String[] args){

//        Ax obj=new Ax();
//        try {
//            obj.show();
//        }
//        catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        int i=0;
        int j=0;
//        int num[]=new int[5];
//        String str=null;
         try{
//             System.out.println(str.length());
             j=18/i;
//             System.out.println(num[1]);
//             System.out.println(num[5]);
             if(j==0)
                 throw new ArithmeticException("i don't want to print zero");
         }
         catch (ArithmeticException e) {
             j=18/1;
             System.out.println("that's the default output.." + e);
         }
////         catch (ArithmeticException e) {
////             System.out.println("cannot divide by zero.." + e);
////         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("stay in ur limit .." + e);
//         }
//         catch(Exception e){
//             System.out.println("something went wrong.." + e);
//         }
//        System.out.println(j);
    }
}
