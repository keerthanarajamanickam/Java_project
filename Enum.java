//enum Status{
//    Running,Failed,Pending,Success;
//}
enum Laptop1{
    Macbook(2000),XPS(4000),Surface(6000),Thinkpad(8000);

    Laptop1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
}


public class Enum {
    public static void main(String[] args){

//         Laptop1 l=Laptop1.Thinkpad;
//        System.out.println(l + " : " + l.getPrice());

        for(Laptop1 lap:Laptop1.values()){
            System.out.println(lap + " : " +lap.getPrice());
        }
//        Status s=Status.Running;
//        System.out.println(s);

//        Status s=Status.Running;
//        System.out.println(s.ordinal());

//        Status ss[]=Status.values();
//        for(Status s:ss){
//            System.out.println(s + " : " + s.ordinal());
//        }
//          if(s == Status.Running)
//              System.out.println("All good");
//          else if(s == Status.Failed)
//              System.out.println("Try again");
//          else if(s == Status.Pending)
//              System.out.println("Please wait");
//          else
//              System.out.println("done");

//          switch(s){
//              case Running:
//                  System.out.println("all good");
//                  break;
//              case Failed:
//                  System.out.println("try again");
//                  break;
//              case Pending:
//                  System.out.println("please wait");
//                  break;
//              default:
//                  System.out.println("done");
//          }

    }
}
