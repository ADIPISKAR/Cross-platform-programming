package Lesson_1;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void popolnenieScheta(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен на " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Сумма пополнения должна быть больше 0.");
        }
    }

    public void snyatieSoScheta(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Со счета снято " + amount + ". Новый баланс: " + balance);
        } else if (amount > balance) {
            System.out.println("Недостаточно средств на счете.");
        } else {
            System.out.println("Сумма снятия должна быть больше 0.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.popolnenieScheta(500);
        account.snyatieSoScheta(300);
        account.snyatieSoScheta(1500);
    }
}
