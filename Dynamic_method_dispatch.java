class X{
    public void show(){
        System.out.println("in X show");
    }
}
class Y extends X{
    public void show(){
        System.out.println("in Y show");
    }
}
class Z extends X{
    public void show(){
        System.out.println("in Z show");
    }
}



public class Dynamic_method_dispatch {
    public static void main(String[] args){
        X obj=new X();
        obj.show();
                                 //DYNAMIC METHOD DISPATCH -- WE'RE NOT SURE WHICH METHOD WAS CALLED
        obj=new Y();
        obj.show();

        obj=new Z();
        obj.show();
    }
}
