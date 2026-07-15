import java.util.*;
class Order {
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;

    //Parent constructor-Parameterized constructor
    public Order(String orderId, double totalAmount){
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.orderDate =new Date().toString();
        System.out.println("Order created: " + orderId);
    }
    //Parent method
    public double calculateDiscount() {
        // Base discount: 5% for all orders
        return totalAmount *0.05;
    } 
    public void displayOrder(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: ₹ " + totalAmount);
        System.out.println("Date: " + orderDate);
    }
}
class PremiumOrder extends Order{
    private String membershipTier;
    private double cashback;

    // Using super() to call parent constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier){
    super(orderId,totalAmount);// Must be the first line
    this.membershipTier = membershipTier;
    this.cashback = totalAmount * 0.10; //10% cashback
    System.out.println("Cashback " + cashback + "----" );
    System.out.println("Premium order with " + membershipTier +"membershipTier");
    }
    @Override
    public double calculateDiscount(){
        //Get parent's discount(5%)and add premium discount(10%)
        double baseDiscount = super.calculateDiscount();//Calling parent method
        double premiumDiscount =totalAmount * 0.10;
        double finalDiscount =baseDiscount + premiumDiscount;
        System.out.println("Premium discount applied: " + finalDiscount);
        return finalDiscount;
    }
    @Override
    public void displayOrder(){
        super.displayOrder();//Call parent's display
        System.out.println("Membership: " + membershipTier);
        System.out.println("Cashback: ₹" + cashback);
    }
}
public class EcommerceApp{
    public static void main(String[]args){
        PremiumOrder order = new PremiumOrder("ORD123", 5000, "Gold");
        order.displayOrder();
        order.calculateDiscount();
    }
    
}