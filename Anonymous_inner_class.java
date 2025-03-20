class L{
    public void show(){
        System.out.println("in L show");
    }
    public void show1(){
        System.out.println("in show1");
    }
}


public class Anonymous_inner_class {
    public static void main(String[] args){
        L obj=new L(){
            public void show(){
                System.out.println("in new show");
            }
            public void show1(){
                System.out.println("in new show1");
            }
        };
        obj.show();
        obj.show1();

    }
}
