/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plot.managementt;

/**
 *
 * @author admin
 */
public class Operations {

    public static double getTotalPrice(double plotArea, String sectorName, Plot plotA) {

        if (sectorName.equalsIgnoreCase("A")) {
            return plotArea * Rates.sectorARates;
        } else if (sectorName.equalsIgnoreCase("B")) {
            return plotArea * Rates.sectorBRates;
        } else if (sectorName.equalsIgnoreCase("C")) {
            return plotArea * Rates.sectorCRates;
        } else {

            return 0;
        }
    }

    public static double getTotalPriceAfterSubsidy(double totalPrice, Plot plotA) {

        if (totalPrice < Rates.subsidyEligibility) {
            plotA.subsidyStatus++;
            return totalPrice - Rates.subsidyAmount;
        } else {
            return totalPrice;
        }
    }

    public static double getRegistryCharges(double totalPrice) {

        if (totalPrice < 3000000) {
            return ((totalPrice * Rates.registryCharge) / 100);
        }
        return ((totalPrice * Rates.registryChargesPercentage) / 100);
    }

    public static double getCGSTCharges(double registryAmount) {
        return ((registryAmount * Rates.CGSTChargesPercentage) / 100);
    }

    public static double getSGSTCharges(double registryAmount) {
        return ((registryAmount * Rates.SGSTChargesPercentage) / 100);
    }

    public static double getSocietyCharge(double totalPrice) {
        if (totalPrice < 5000000) {

            return 0;

        } else {
            return Rates.societyCharges;
        }

    }

    public static double getParking(double totalPrice, Plot plotA) {

        if (totalPrice < 5) {

            return Rates.parkingCharges * plotA.quantity;

        } else {

            return Rates.parkingCharges;
        }

    }

}
