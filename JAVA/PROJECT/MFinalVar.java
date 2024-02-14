class CFinal {
    final int a = 10;           //a is declared in final
    public void change(){
        a = 20;                 //trying to change value of a, which is not possible!!
    }
    public void disp(){
        System.out.println("Value of a is : "+a);
    }
}

public class MFinalVar{
    public static void main(String[] args) {
        CFinal obj = new CFinal();
        obj.change();           //ERROR: MFinalVar.java:4: error: cannot assign a value to final variable a 
        obj.disp();
    }
}
