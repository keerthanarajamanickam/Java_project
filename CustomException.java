class MyException extends RuntimeException{
    public MyException(String str){
         super(str);
    }
}

public class CustomException {
    public static void main(String[] args){
       int i=0;
       int j=0;

        try {
            j=18/i;
            if(j==0)
                throw new MyException("i don't want to print zero");
        }
        catch (MyException e) {
            j=18/1;
            System.out.println("that's the default output");
        }
        System.out.println(j);
    }
}
