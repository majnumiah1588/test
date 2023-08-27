package E81;

public class CashRegister {
    public double payment;
    double remainingAmount;

    public  CashRegister(){
        payment = 0;
    }
    public void receivePayment(int coinCount, Coin coinType){

        payment = payment + coinCount * coinType.getValue();
    }

    public double getPayment() {
        return payment;
    }

    public double calculateRemainingAmount(double purchase){
        remainingAmount = payment - purchase;
        return remainingAmount;
    }
    /*public int giveChange(Coin coinType){
        int changeCoin = (int)(remainingAmount / coinType.getValue());
    }*/
}
