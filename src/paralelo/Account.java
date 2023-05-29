package paralelo;

public class Account {

    private int code;
    private String holder;
    private double balance;

    public account(int code, String holder) {
        this.code = code;
        this.holder = holder;
    }
    
    public int getCode() {
        return code;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }
}
