public class Order {
    private String orderId;
    private String stockName;
    private double price;
    private double quantity;

    static long prevOrderID=0;

    Order(String stockName,double price, double quantity){
        this.orderId = Long.toString(++prevOrderID);
        this.stockName = stockName;
        this.price = price;
        this.quantity = quantity;
    }

    public Order() {
        this.orderId = null;
    }


    public String getOrderId() {
        return orderId;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }



}
