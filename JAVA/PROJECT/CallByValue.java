//In JAVA, all the basic variables linke int,char,float will be passed as call by value.

class c1{
    public void change(int a){
        System.out.println("Value of a is : "+a);
        a = 20;
        System.out.println("New Value of a is : "+a);
    }
}

public class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        c1 obj = new c1();
        obj.change(a);
        System.out.println("Value of a after calling the method is : "+a);
    }
}
