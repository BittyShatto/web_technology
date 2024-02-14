class Test{
    int a;
    {
        a = 10;                 //initializer block
    }
    public void disp(){
        System.out.println("Value of a : " +a);
    }
}

public class Minit {
    public static void main(String[] args) {
        Test t1,t2;
        t1 = new Test();
        t2 = new Test();
        t1.disp();
        t2.disp();
    }
}
