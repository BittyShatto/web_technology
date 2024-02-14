class CFinal{
    public void disp(){
        System.out.println("Final Method");
    }
}

public class MFinalMethod {
    public static void main(String[] args) {
        CFinal obj = new CFinal();
        obj.disp();
    }
}
