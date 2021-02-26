package StrategyPattern;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 2/26/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 2/26/2021
 */
public class Ticket {

    private PromoteStrategy promoteStrategy;
    private double price;
    private String name;

    public PromoteStrategy getPromoteStrategy() {
        return promoteStrategy;
    }

    public void setPromoteStrategy(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket(PromoteStrategy promoteStrategy) {
        this.promoteStrategy = promoteStrategy;
    }

    public Ticket() {
    }

    public double getPromotedPrice(){
        return this.promoteStrategy.DoDiscount(this.price);
    }
}
