@FunctionalInterface
interface Fruit{
//    void apple();
//     void mango();
//      void apple(int i,int j);
    int add(int i,int j);
}

public class Functional_interface {
    public static void main(String[] args){
//        Fruit f=new Fruit()   //ANONYMOUS INNER CLASS
//        {
//            public void apple(){
//                System.out.println("apple is a fruit");
//            }
//        };
//        f.apple();
//         Fruit f= () -> System.out.println("apple is a fruit");   //LAMBDA EXPRESSION (AVAILABLE IN JAVA 8 VERSION OR MORE )
//
//        f.apple();
//        Fruit f= (i,j) -> System.out.println("apple is a fruit" + " " + " & " + " value of i : " + i + " & " +" value of j : " + j);   //LAMBDA EXPRESSION (AVAILABLE IN JAVA 8 VERSION OR MORE )
//
//        f.apple(7,8);

        Fruit f=(i,j) -> i+j;
         int result=f.add(8,7);
        System.out.println(result);



    }
}
