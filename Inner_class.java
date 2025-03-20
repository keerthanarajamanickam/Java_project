 class M{
    int n=70;
    public void show(){
        System.out.println("in M show");
    }

    static class N{
        public void show1(){
            System.out.println("in N show");
        }
    }
}
public class Inner_class {
    public static void main(String[] args) {
        M obj = new M();
        obj.show();

//        M.N obj1=obj.new N();     //OBJECT CREATION FOR INNER CLASS IF THE INNER CLASS WASN'T STATIC
//        obj1.show();

        M.N obj1 = new M.N();        //OBJECT CREATION FOR INNER CLASS IF THE INNER CLASS STATIC
        obj1.show1();

        }
    }
