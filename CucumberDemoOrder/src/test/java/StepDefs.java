import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertTrue;

public class StepDefs {
    private Order order;
    private long prevOrderId = Order.prevOrderID;
    private String givenStockName;
    private double givenPrice;
    private double givenQuantity;
    @Given("A trader wants to create an order")
    public void a_trader_wants_to_create_an_order() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Trader wants to create order");
    }

    @When("He wants to buy {} {string} shares at {}")
    public void he_wants_to_buy_shares_at(Double qty, String stockName, Double price) {
        // Write code here that turns the phrase above into concrete actions
        order = new Order(stockName,price,qty);
        givenStockName = stockName;
        givenPrice = price;
        givenQuantity = qty;
    }

    @Then("A valid order should be created")
    public void a_valid_order_should_be_created() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(checkValidity());
    }

    public boolean checkValidity(){
//        System.out.println(order.getPrice() + " " + givenPrice + " " + (Double.compare(order.getPrice(), givenPrice)));
//        System.out.println((order.getQuantity() - givenQuantity) == 0.0);
        return (Long.parseLong(order.getOrderId()) - prevOrderId == 1 && order.getStockName() == givenStockName && order.getPrice() == givenPrice && order.getQuantity() == givenQuantity);
    }
}
