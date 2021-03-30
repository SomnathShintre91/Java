import java.util.Scanner;

public class Federal_Bank {
    public static void main(String[] args) {

        System.out.println("\n\t--------------------------------------------------");
        System.out.println("\t\t ******** FEDERAL BANK *********");
        System.out.println("\t--------------------------------------------------");
        try {
            System.out.print("\tEnter Total Number Of Accounts To be Created: ");
            Scanner sc = new Scanner(System.in);
            int numOfAcc = sc.nextInt();
            BankAccount[] acc = new BankAccount[numOfAcc];
            int chAcc = 1, accNum, oCh, oE = 1, transferto, password;
            double withdrawAmount, transferAmount, depositAmount;
            String msg;

            for (int i = 0; i < numOfAcc; i++) {
                acc[i] = new BankAccount();
            }

            do {
                try {
                    System.out.print("\n\tEnter Your Account Number[1 to " + numOfAcc + "]: ");
                    accNum = sc.nextInt();
                    if (accNum < 0 && accNum > numOfAcc) {
                        throw new ArrayIndexOutOfBoundsException();
                    }

                    do {
                        try {

                            System.out.println("\n\tOptions: ");
                            System.out.println("\t1.Balance Enquery\t2.Withdraw");
                            System.out.println("\t3.Transfer       \t4.Deposite");
                            System.out.print("\n\tEnter choise: ");
                            oCh = sc.nextInt();

                            switch (oCh) {
                                case 1:
                                    System.out.println("\tCurrent Balance: " + acc[accNum - 1].balanceEnquery());
                                    break;
                                case 2:
                                    System.out.print("\n\tEnter Withdraw Amount = ");
                                    withdrawAmount = sc.nextDouble();
                                    withdrawAmount = acc[accNum - 1].withdraw(withdrawAmount);
                                    System.out.println("\tWithdraw Amount = " + withdrawAmount);
                                    System.out.println("\tCurrent Balance: " + acc[accNum - 1].balanceEnquery());
                                    break;
                                case 3:
                                    System.out.print("\n\tAccounts: ");
                                    for (int i = 0; i < numOfAcc; i++) {
                                        if (i == (accNum - 1))
                                            continue;
                                        System.out.print((i + 1) + " ");
                                    }
                                    System.out.print("\n\tChoose Account Number: ");
                                    transferto = sc.nextInt();
                                    System.out.print("\tEnter Amount to Transfered: ");
                                    transferAmount = sc.nextDouble();
                                    System.out.print("\n\tEnter Password: ");
                                    password = sc.nextInt();
                                    msg = acc[accNum - 1].transfer(password, transferAmount, acc[transferto - 1]);
                                    System.out.println(msg);
                                    break;
                                case 4:
                                    System.out.print("\n\tEnter Deposit Amount = ");
                                    depositAmount = sc.nextDouble();
                                    acc[accNum - 1].deposit(depositAmount);
                                    System.out.println("\tDeposited Amount = " + depositAmount);
                                    System.out.println("\tCurrent Balance: " + acc[accNum - 1].balanceEnquery());
                                    break;
                                default:
                                    System.out.println("\tPlease enter valid option...");

                            }

                            System.out.println("\n\tWant To Continue?");
                            System.out.print("\t[Press 1 to Continue or 0 to Exit] : ");
                            oE = sc.nextInt();

                        } catch (NegetiveNumberException nne) {
                            System.out.println(nne.getMessage());
                        } catch (LowBalanceException lbe) {
                            System.out.println(lbe.getMessage());
                        } catch (PasswordMismatchException pme) {
                            System.out.println(pme.getMessage());
                        }
                    } while (oE == 1);

                    System.out.println("\n\tWant To Change Account? ");
				System.out.print("\t[Press 1 to Continue or 0 to Exit] : ");
                    chAcc = sc.nextInt();
                } catch (ArrayIndexOutOfBoundsException aiobe) {
                    System.out.println("\tAccount Number Does Not Exits");
                }
            } while (chAcc == 1);

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}