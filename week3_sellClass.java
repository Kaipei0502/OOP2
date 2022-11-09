import java.util.*;
class sellClass implements Runnable{
    static int allticket = 10000;
    int ticket;
    Thread t;
    int num;

    public sellClass(String name){
        ticket = 0;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run(){
        Random a = new Random();
        while(allticket != 0){
            num = 1 + a.nextInt(4);
            while(buyTicket(num) == true){
                ticket += num;
                System.out.println(t.getName() +"賣出"+ ticket+"張");
                num = 1 + a.nextInt(4);
            }
        }
        System.out.println(t.getName() +"總共賣出:"+ ticket+"張");
    }
    
    synchronized private static boolean buyTicket(int num){
        if(allticket - num >= 0){
            allticket -= num;
            return true;
        }else{
            return false;
        }
    }
}
public class week3_sellClass{
    public static void main(String[] args){
        sellClass tA = new sellClass("Machine 1");
        sellClass tB = new sellClass("Machine 2");
        sellClass tC = new sellClass("Machine 3");
        sellClass tD = new sellClass("Machine 4");
    }
}
