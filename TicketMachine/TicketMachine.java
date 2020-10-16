import java.util.Scanner;

/**
 * @author wushuaikang
 * @date 2020/9/29-14:10
 */
public class TicketMachine {
    int price;
    int balance;
    int total;
    Scanner scanner=new Scanner(System.in);
    void setPrice(){
        System.out.println("请输入票价:");
        while(1==1) {
            int price= scanner.nextInt();
            if (price > 0) {
                this.price = price;
                break;
            } else {
                System.out.println("请重新输入:");
            }
        }
    }
    void insertMoney(){
        System.out.println("请投票:");
        while(1==1){
            int money= scanner.nextInt();
        if(money>0){
            balance = money;
            break;
        }else {
            System.out.println("请重新投票:");
           }
        }
    }
    void print(){
        System.out.println("请输入打印票数:");

        while(1==1){
            int amount= scanner.nextInt();
            if(balance>=price*amount) {
               for (int i = 0; i < amount; ++i) {
                System.out.println("===================");
                System.out.println("票价" + price);
                System.out.println("谢谢惠顾");
                System.out.println("===================");
                balance-=price;
                total+=price;
              }
               break;
        }
        else{
            System.out.println("余额不足，请重新输入");
            }
          }
        }
    int refund(){
        int money=balance;
        System.out.println("您的余额剩余:"+balance);
        balance=0;
        return money;
    }
    int totalMoney(){
        System.out.println("您当前的营业额为："+total);
        return total;
    }


    public static void main(String[] args) {
        TicketMachine test1 =new TicketMachine();
        test1.setPrice();
        test1.insertMoney();
        test1.print();
        test1.refund();
        test1.totalMoney();
    }
}
