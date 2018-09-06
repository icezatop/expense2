package LabSE;

public class Account {
    private int money;
    private int balance = 100;


  public Account(int money){
      this.money=money;

  }
    public int getMoney() {
        return money;
    }

    public int getBalance() {
        return balance;
    }
    public int income(int money){
      if (money<=0){
          throw new IllegalArgumentException("เลขมากกวาสศูนย์นะ");
      }else{
          balance=balance+money;
          return balance;
      }

    }
    public int expane(int money){
        balance=balance-money;
        return balance;
    }
}
