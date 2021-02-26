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
public interface PromoteStrategy {
    double DoDiscount(double price);
}
