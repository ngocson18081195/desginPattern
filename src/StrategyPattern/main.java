package StrategyPattern;


import java.util.Random;

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
public class main {
    public static void main(String[] args) {
        System.out.println("Start Getting tickets");
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50d * i);
            GeneratePromote(random, ticket);

            System.out.println("Promote Prices" + ticket.getName() + " is " + ticket.getPromotedPrice()
                    + " " + ticket.getPromoteStrategy().getClass().getName());


            GeneratePromote(random, ticket);
            System.out.println("Promote Prices" + ticket.getName() + " is " + ticket.getPromotedPrice()
                    + " " + ticket.getPromoteStrategy().getClass().getName());
        }
    }

    private static void GeneratePromote(Random random, Ticket ticket) {
        int strategyIndex = random.nextInt(4);
        switch (strategyIndex) {
            case 0:
                ticket.setPromoteStrategy(new NoDiscount());
                break;
            case 1:
                ticket.setPromoteStrategy(new QuarterDiscount());
                break;
            default:
                ticket.setPromoteStrategy(new HalfDiscount());
                break;
        }
    }
}
