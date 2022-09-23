import java.util.*;

public class week2_HashMap {
    public static void main(String[] args){
        HashMap <Integer, String> hMap = new HashMap<>();
        int ans;
        hMap.put(1, "Janauary");
        hMap.put(2, "February");
        hMap.put(3, "March");
        hMap.put(4, "April");
        hMap.put(5, "May");
        hMap.put(6, "June");
        hMap.put(7, "July");
        hMap.put(8, "August");
        hMap.put(9, "September");
        hMap.put(10, "October");
        hMap.put(11, "November");
        hMap.put(12, "December");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("請輸入1~12? ");
            ans = input.nextInt();
            if(ans < 1 || ans > 13){
                System.out.println("範圍錯誤!");
            }
        } while(ans < 1 || ans > 13);
            System.out.printf("第%d月的英文單字為%s ", ans, hMap.get(ans));
    }
}
