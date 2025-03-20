class Laptop{
    static String name;
    String model;

    public Laptop(){
        model="REDMI";
        System.out.println("in constructor");
    }
    static{
        name="phone";
        System.out.println("in static block");
    }
    public void process(){
        System.out.println(name + " " + model);
    }
}
    public class Static_concepts {
    public static void main(String[] args){
        Laptop l=new Laptop();
//        l.model="oppo";
//        Laptop.name="phone";
        l.process();

        Laptop l1=new Laptop();

    }
}
