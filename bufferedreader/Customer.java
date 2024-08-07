package bufferedreader;

public class Customer {
    private String customerid;
    private String transactionid;
    private String transactiondate;
    private double transactionamount;

    public Customer(String customerid,  String transactionid, String transactiondate, double transactionamount) {
        this.customerid = customerid;
        this.transactionid = transactionid;
        this.transactiondate = transactiondate;
        this.transactionamount = transactionamount;
    }




    public double getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(double transactionamount) {
        this.transactionamount = transactionamount;
    }

    public String getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(String transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    @Override
    public String toString() {
        return customerid+","+transactionid+","+transactiondate+","+transactionamount;
    }
}
