class An{
    public void show1(){
        System.out.println("in A show");
    }
}
class Bi extends An{
    public void show2(){
        System.out.println("in B show");
    }
}
public class Upcasting_downCasting {
    public static void main(String[] args){
         An obj=(An)new Bi();   //UPCASTING
         obj.show1();

         Bi obj1=(Bi) obj;     //DOWNCASTING
         obj1.show2();


    }
}
