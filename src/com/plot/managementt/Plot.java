package com.plot.managementt;

/**
 *
 * @author admin
 */
public class Plot {

    private String sectorName;
    private double plotId;
    private double length;
    private double width;
    public int subsidyStatus = 0;
    public int quantity;

    public Plot() {
        this.sectorName = "A";
        this.plotId = 1;
        this.length = 20;
        this.width = 50;
        this.quantity = 2;
    }

    public Plot(String sectorName, double plotId, double length, double width, int q) {
        this.sectorName = sectorName;
        this.plotId = plotId;
        this.length = length;
        this.width = width;
        this.quantity = q;
    }

    public double getPlotArea() {
        return length * width;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    public double getPlotId() {
        return plotId;
    }

    public void setPlotId(double plotId) {
        this.plotId = plotId;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSubsidyStatus() {
        return subsidyStatus;
    }

    public void setSubsidyStatus(int subsidyStatus) {
        this.subsidyStatus = subsidyStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public void setPlotDetails(double l, double w, double id, String sector) {
//        length = l;
//        width = w;
//        plotId = id;
//        sectorName = sector;
//    }
    @Override
    public String toString() {
        return "Plot{" + "sectorName=" + sectorName + ", plotId=" + plotId + ", length=" + length + ", width=" + width + ", subsidyStatus=" + subsidyStatus + ", quantity=" + quantity + '}';
    }

}
