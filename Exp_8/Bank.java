public interface Bank {

    public static final int permanentpassword = 9359;

    public abstract double balanceEnquery();

    public abstract double withdraw(double withdrawAmount) throws LowBalanceException, NegetiveNumberException;

    public abstract String transfer(int password, double transferAmount, BankAccount to)
            throws LowBalanceException, NegetiveNumberException, PasswordMismatchException;

    public abstract void deposit(double depositAmount) throws NegetiveNumberException;

}