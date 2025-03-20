class Animals{
    public Animals(){
        System.out.println("in A");
    }
    public Animals(int a){
        System.out.println("in A int");
    }
}
class Birds extends Animals{
    public Birds(){
        System.out.println("in B");
    }
    public Birds(int b){
        this();
//        super(3);
        System.out.println("in B int");
    }
    public void show(){
        System.out.println("in new show");
    }
}


public class Constructor_concepts {
    public static void main(String[] args){
//         Animals obj1=new Birds(5);
//         new Animals();    //ANONYMOUS OBJECT
        new Birds().show();
         

    }
}
