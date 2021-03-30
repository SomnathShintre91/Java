public class BankAccount implements Bank {

    private double mainBalance;

    @Override
    public double balanceEnquery() {

        return mainBalance;
    }

    @Override
    public double withdraw(double withdrawAmount) throws LowBalanceException, NegetiveNumberException {

        if (withdrawAmount <= 0) {
            throw new NegetiveNumberException("\tInvalid amount = " + withdrawAmount);
        } else if (mainBalance < withdrawAmount) {
            throw new LowBalanceException("\tYou have insufficent balance! \n\tYour current balance is " + mainBalance);
        }
        mainBalance = mainBalance - withdrawAmount;
        return mainBalance;
    }

    @Override
    public String transfer(int password, double transferAmount, BankAccount to)
            throws LowBalanceException, NegetiveNumberException, PasswordMismatchException {

        if (password != Bank.permanentpassword) {
            throw new PasswordMismatchException("\tIncorrect Password! Try Again.");
        }
        if (transferAmount <= 0) {
            throw new NegetiveNumberException("\tInvalid amount = " + transferAmount);
        } else if (this.mainBalance < transferAmount) {
            throw new LowBalanceException("\tYou have insufficent balance! \n\tYour current balance is " + mainBalance);
        }
        this.mainBalance = this.mainBalance - transferAmount;
        to.mainBalance = to.mainBalance + transferAmount;
        return "\tAmmount Transfered";
    }

    @Override
    public void deposit(double depositAmount) throws NegetiveNumberException {

        if (depositAmount <= 0) {
            throw new NegetiveNumberException("\tInvalid amount = " + depositAmount);
        }
        mainBalance = mainBalance + depositAmount;
    }
}