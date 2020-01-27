//
//Points Possible
//100
//
//Last week you purchased 350 shares of stock, for $7.05 per share.
//You were charged you a fee, 2% of the amount you paid for the stock.
//Three days later you sold 70 percent of the stock, for $22.30 per share.
//You were charged you a fee, 2% of the amount you received for the stock.
//
//Write a program that displays the following information:
//
//    X The amount of money you paid for the stock.
//    X The amount of the fee you paid when you bought the stock.
//    X  The number of shares you owned and total value of your stock immediately after your purchase.
//    X The number of shares you owned and total value of your stock just before you sold the 70%.
//    X The amount you sold the stock for.
//    X The amount of the fee you paid when you sold the stock.
//    X The number of shares you owned and total value of your stock after you sold the 70%.
//    X The amount of profit that you made after selling the stock and paying the fees.



package homework_01_pedigosean;
public class Homework_01_PedigoSean {
    public static void main(String[] args) {
       // Magic numbers exist, however this is extensible. Scanner utils
       // can be used to allow user to input total stock purchase.
       double numberOfStocks = 350;
       double stockFee = .02;
       double stockPrice = 7.05;
       double totalPercentSold = .70;
       double salePrice = 22.30;
       double purcahsePriceTotal = CalculateStockPriceTotal(numberOfStocks, stockPrice);
       double purchaseFee = CalculatePurchaseFee(purcahsePriceTotal, stockFee);
       double purchaseValueAfterFee = CalculateStockPriceFee(purcahsePriceTotal, stockFee);
       double totalStockSold = CalculateStockSold(purchaseValueAfterFee, numberOfStocks, totalPercentSold);
       double grossProfitOrLoss = CalculateSaleProfit(totalStockSold, salePrice);
       double saleFee = CalculateSaleFee(grossProfitOrLoss, stockFee);
       double saleTotal = CalculateNetTotal(grossProfitOrLoss, stockFee);
       double profit = CalculateProfit(saleTotal, purchaseValueAfterFee);
       System.out.println("                 PURCHASE INFORMATION");
       System.out.println("Total Stocks Bought: " + numberOfStocks + " stocks");
       System.out.println("Total Cost Before Fee: " + purcahsePriceTotal);       
       System.out.println("Total Purchase Fee: " + purchaseFee);
       System.out.println("Total Purchase Cost After Fee: " + purchaseValueAfterFee);
       System.out.println();
       System.out.println("                 SALE INFORMATION");
       System.out.println("Total Stocks Sold: " + Math.round(totalStockSold) + " stocks");
       System.out.printf("Total Value Before Fee: %.2f", grossProfitOrLoss);       
       System.out.printf("\nTotal Cost of Fee: %.2f", saleFee);
       System.out.println("\nTotal Sale Value After Fee: " + saleTotal);
       System.out.println();
       System.out.println("                 PROFITS/LOSSES");
       System.out.printf("%.2f", profit);
       System.out.println();
       System.out.println();
    }
    
    public static double CalculateStockPriceTotal(double numberOfStocks, double stockPrice) {
        double stockTotal = numberOfStocks;
        double stockPriceTotal = stockPrice * stockTotal;
        return stockPriceTotal;
       
    }
    
    public static double CalculatePurchaseFee(double purcahsePriceTotal, double stockFee) {
        double totalFee = purcahsePriceTotal * stockFee;
        return totalFee;
    }
    
    public static double CalculateStockPriceFee(double purcahsePriceTotal, double stockFee) {
        double totalFee = purcahsePriceTotal * stockFee;
        double stockPriceWithFee = purcahsePriceTotal + totalFee;
        return stockPriceWithFee;
    }
    
    public static double CalculateSaleFee(double stockPriceTotal, double stockFee) {
        double totalFee = stockPriceTotal * stockFee;
        return totalFee;
    }
    
    
    public static double CalculateStockSold(double purchaseValueAfterFee, double numberOfStocks, double totalPercentSold) {
            double stockTotal = numberOfStocks;
            double totalStockSold = stockTotal * totalPercentSold;
            return totalStockSold;
       
    }
    
    public static double CalculateSaleProfit(double totalStockSold, double salePrice) {
            double netLossProfit = totalStockSold * salePrice;
            return netLossProfit;
       
    }
    
    public static double CalculateNetTotal(double grossProfitOrLoss, double stockFee) {
        double totalFee = grossProfitOrLoss * stockFee;
        double stockValueAfterFee = grossProfitOrLoss - totalFee;
        return stockValueAfterFee;
    }
    
    public static double CalculateProfit(double saleTotal, double purchaseValueAfterFee) {
        double profit = saleTotal - purchaseValueAfterFee;
        return profit;
    }
    
}
