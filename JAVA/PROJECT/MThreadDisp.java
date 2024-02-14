import java.util.*;
class CThread implements Runnable{
    int m,n;
    public CThread(int a, int b){
        m=a;
        n=b;
    }
    public void run(){
        while(m != n){
            System.out.print("\t" +m);
            if(m < n) m++;
            else m--;
        }
        System.out.print("\t" +m);
        }
    }
class MThreadDisp{
    public static void main(String args[]){
        CThread t1,t2;
        Thread p,q;
        int m,n;
        Scanner s = new Scanner(System.in);

        try{
            System.out.println("Enter m: ");
            m = s.nextInt();
            System.out.println("Enter n: ");
            n = s.nextInt();
            t1 = new CThread(m,n);
            t2 = new CThread(n,m);
            p =  new Thread(t1);
            q =  new Thread(t2);
        }

        catch(Exception e){
            System.out.println("Error: " +e);
        }
    }
}    