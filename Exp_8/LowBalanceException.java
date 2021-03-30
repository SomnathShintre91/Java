public class LowBalanceException extends Exception {

    private static final long serialVersionUID = 1L;

    public LowBalanceException() {
        super();
    }

    public LowBalanceException(String msg) {
        super(msg);
    }

}
