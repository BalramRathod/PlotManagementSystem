package com.plot.managementt;

/**
 *
 * @author admin
 */
public class Estimator {

    public static void printEstimatorDetailsA(double plotArea, String sectorName, Plot plotA) {

        double totalPrice = Operations.getTotalPrice(plotArea, sectorName, plotA);
        double totalPriceAfterSubsidy = Operations.getTotalPriceAfterSubsidy(totalPrice, plotA);
        double registryCharges = Operations.getRegistryCharges(totalPrice);
        double cgstCharges = Operations.getCGSTCharges(registryCharges);
        double sgstCharges = Operations.getSGSTCharges(registryCharges);
        double societyCharge = Operations.getSocietyCharge(totalPrice);
        //double parkingCharge = Operations.getParking(plotA);
        double parking = Operations.getParking(totalPrice, plotA);
        int subsidyStatus = plotA.subsidyStatus;
        int quantity = plotA.quantity;

        System.out.println("Total price of plotA  is     :" + totalPrice);
        System.out.println("Total price after subsidy is :" + totalPriceAfterSubsidy);
        System.out.println("Eligible for subsidy or Not  :" + subsidyStatus);
        System.out.println("Registery charges            :" + registryCharges);
        System.out.println("CGST charges                 :" + registryCharges);
        System.out.println("SGST charges                 :" + registryCharges);
        System.out.println("(IF TOTAL AMOUNT LESS 50 LAKH THEN NO SOCIETY CHARGE)Society Charges   :" + societyCharge);
        System.out.println("Parking Charges              :" + parking);
        System.out.println("Parking QTY                  :" + quantity);

    }

    public static void printEstimatorDetailsB(double plotArea, String sectorName, Plot plotA) {

        double totalPrice = Operations.getTotalPrice(plotArea, sectorName, plotA);
        double totalPriceAfterSubsidy = Operations.getTotalPriceAfterSubsidy(totalPrice, plotA);

        double registryCharges = Operations.getRegistryCharges(totalPrice);
        double cgstCharges = Operations.getCGSTCharges(registryCharges);
        double sgstCharges = Operations.getSGSTCharges(registryCharges);
        double societyCharge = Operations.getSocietyCharge(totalPrice);
        //double parkingCharge = Operations.getParking(plotA);
        double parking = Operations.getParking(totalPrice, plotA);
        int subsidyStatus = plotA.subsidyStatus;
        int quantity = plotA.quantity;

        System.out.println("Total price of plotB  is     :" + totalPrice);
        System.out.println("Total price after subsidy is :" + totalPriceAfterSubsidy);
        System.out.println("Eligible for subsidy or Not  :" + subsidyStatus);
        System.out.println("Registery charges            :" + registryCharges);
        System.out.println("CGST charges                 :" + registryCharges);
        System.out.println("SGST charges                 :" + registryCharges);
        System.out.println("(IF TOTAL AMOUNT LESS 50 LAKH THEN NO SOCIETY CHARGE)Society Charges   :" + societyCharge);
        System.out.println("Parking Charges              :" + parking);
        System.out.println("Parking QTY                  :" + quantity);
    }

    public static void printEstimatorDetailsC(double plotArea, String sectorName, Plot plotA) {

        double totalPrice = Operations.getTotalPrice(plotArea, sectorName, plotA);
        double totalPriceAfterSubsidy = Operations.getTotalPriceAfterSubsidy(totalPrice, plotA);
        double registryCharges = Operations.getRegistryCharges(totalPrice);
        double cgstCharges = Operations.getCGSTCharges(registryCharges);
        double sgstCharges = Operations.getSGSTCharges(registryCharges);
        double societyCharge = Operations.getSocietyCharge(totalPrice);
        //double parkingCharge = Operations.getParking(plotA);
        double parking = Operations.getParking(totalPrice, plotA);
        int subsidyStatus = plotA.getSubsidyStatus();
        int quantity = plotA.quantity;

        System.out.println("Total price of plotC  is     :" + totalPrice);
        System.out.println("Total price after subsidy is :" + totalPriceAfterSubsidy);
        System.out.println("Eligible for subsidy or Not  :" + subsidyStatus);
        System.out.println("Registery charges            :" + registryCharges);
        System.out.println("CGST charges                 :" + registryCharges);
        System.out.println("SGST charges                 :" + registryCharges);
        System.out.println("Society Charges              :" + societyCharge);
        System.out.println("(IF TOTAL AMOUNT LESS 50 LAKH THEN NO SOCIETY CHARGE)  :" + societyCharge);
        System.out.println("Parking Charges            :" + parking);
        System.out.println("Parking QTY                :" + quantity);

    }

}
