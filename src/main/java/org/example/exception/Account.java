package org.example.exception;


class LowBalanceException extends WithdrawalException {  //1
    public LowBalanceException(String msg){ super(msg);    }
}

class WithdrawalException extends Exception { //2
    public WithdrawalException(String msg){ super(msg);    }
}

public class Account {

    double balance;
    public void withdraw(double amount) throws WithdrawalException{
        try{
            throw new RuntimeException("Not Implemented");
        }catch(Exception e){
            throw new LowBalanceException(e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            Account a = new Account();
            a.withdraw(100.0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
