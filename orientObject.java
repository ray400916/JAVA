
class Shop {
    private double totalAmount;

    public Shop() {
        this.totalAmount = 0;
    }

    public Shop(double initialAmount) {
        this.totalAmount = initialAmount;
    } // overload

    public void calculateBalance(double amountSpent) {
        this.totalAmount += amountSpent;
        System.out.println("Shop balance after spending: " + this.totalAmount);
    }
}

class Human {
    private double money;
    public int age = 18;

    public Human(double initialMoney) {
        this.money = initialMoney;
    }

    public void spendMoney(double amount, Shop shop) {
        if (this.money >= amount) {
            this.money -= amount;
            shop.calculateBalance(amount);
            System.out.println("Human balance after spending: " + this.money);
        } else {
            System.out.println("Not enough money to spend.");
        }
    }
}

public class orientObject {
    public static void main(String[] args) {
        Shop wkz = new Shop();
        Human ez = new Human(500);
        ez.age = 63;
        System.out.println(ez.age);
        // System.out.println(ez.money);
        // Human vitor = new Human();
        // Human chen = ez;

        ez.spendMoney(800, wkz);
        // chen.spendMoney(200, wkz);
    }

}
