//In JAVA, all the objects will be passed by call by reference

class cint{
    public int a;
}
class c1{
    public void change(cint p){
        System.out.println(p.a);
        p.a = 20;
        System.out.println(p.a);
    }
}

public class CallByReference {
    public static void main(String[] args) {
        cint q = new cint();
        q.a = 5;
        c1 obj = new c1();
        obj.change(q);
        System.out.println(q.a);
    }
}
