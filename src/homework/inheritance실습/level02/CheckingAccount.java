package homework.inheritance실습.level02;

public class CheckingAccount extends Account {

    private String cardNo;

    public CheckingAccount(String accId,  String ownerName, long balance, String cardNo){
        super(accId,balance,ownerName);
        this.cardNo = cardNo;
    }
    public void pay(String cardNo, int amount){
        if(this.cardNo.equals(cardNo) && super.getBalance() > amount){
            super.withdraw(amount);
        }else System.out.println("지불이 불가능합니다.");
    }
}
