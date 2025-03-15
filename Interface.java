interface Human{
    void show();
}

class Alien implements Human,Animal {

    @Override
    public void show() {
        System.out.println("in new show");
    }

    @Override
    public void write() {
        System.out.println("writing");
    }
}

interface Animal extends Human{
    void write();
}




public class Interface {
    public static void main(String[] args){
        Alien a=new Alien();
        a.show();
        a.write();
    }
}
