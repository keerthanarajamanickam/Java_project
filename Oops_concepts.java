//class A{        //INHERITANCE
//    public void run(){
//    System.out.println("running");
//    }
//}
//class B extends A{
//    public void walk(){
//        System.out.println("walking");
//    }
//}
    /* INHERITANCE END */

//class A{      //METHOD OVERLOADING
//    public int add(int a,int b){
//        return a+b;
//    }
//}
//class B extends A{
//    public int add(int a,int b,int c){
//        return a+b+c;
//    }
//}
          /* METHOD OVERLOADING END */

//class A {        //METHOD OVERRIDING
//    public int add(int a, int b) {
//        return a + b;
//    }
//}
//class B extends A{
//    public int add(int a,int b){
//        return a+b+1;
//    }
//}
           /* METHOD OVERRIDING END */

//class A{         //ENCAPSULATION
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//    public void setB(int b){
//        this.b=b;
//    }
//
//
//    private int a;
//    private int b;

//    private int a=2;
//    private int b=6;

       /*ENCAPSULATION END */

abstract class A{           //ABSTRACTION
    public abstract void show();
}
class B extends A{

    @Override
    public void show() {
        System.out.println("in B show");
    }
}
class C extends B{

    @Override
    public void show() {
        System.out.println("in C show");
    }
}
      /*ABSTRACTION END */

public class Oops_concepts{  //CLASS
         public static void main(String[] args){
          B obj=new C();
          obj.show();

          obj=new B();
          obj.show();
          
             //         B obj=new B();  //OBJECT CREATION
//             obj.add(2,78);
//         System.out.println("addition of numbers : " + " " + obj.add(2,78));
//         obj.getA();
//         obj.getB();
//           obj.setA(30);
//           obj.setB(40);
//         System.out.println(obj.getA() + " " + obj.getB());


//         obj.add(2,4);
//         obj.add(5,8,6);
//             obj.run();
//             obj.walk();
//             obj.add(2,4);

     }

      }
