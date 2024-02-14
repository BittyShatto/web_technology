class CBase{
    public final void disp(){
        System.out.println("Final Method in Base Class!");
    }
    public void show(){
        System.out.println("Show Method in Base Class!");
    }
}

class CDerived extends CBase{
    public void show(){
        super.show();
        System.out.println("Show Method in Derived Class!");
    }
}

public class FinalOvrWrite {
    public static void main(String[] args) {
        CDerived obj = new CDerived();
        obj.disp();
        obj.show();
    }
}
//final methods cannot be overwritten



/*
 * final class CBase{       //if a class is declared final, then it cannot be inherited.
 *      ....
 * }
 * 
 * class Cderived extends CBase{
 *      .....
 * }
 * 
 */
