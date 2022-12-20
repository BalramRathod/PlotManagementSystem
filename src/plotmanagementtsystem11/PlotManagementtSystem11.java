package plotmanagementtsystem11;

import com.plot.managementt.Estimator;
import com.plot.managementt.Plot;

/**
 *
 * @author admin
 */
public class PlotManagementtSystem11 {

    public static void main(String[] args) {

        System.out.println("*********************PRINT SECTOR A INFORMATION***********************");
        Plot plotA = new Plot();
        //invoking toString meyhods and print Sector A info.............
        System.out.println(plotA.toString());
        double plotAreaA = plotA.getPlotArea();
        System.out.println("Area of Plot A       :" + plotAreaA);
         Estimator.printEstimatorDetailsA(plotAreaA, "A", plotA);

        System.out.println("*********************PRINT SECTOR B INFORMATION***********************");
        Plot plotB = new Plot("B", 2, 10, 20, 1);
        //invoking toString meyhods and print Sector A info.............
        System.out.println(plotB.toString());
        double plotAreaB = plotB.getPlotArea();
        System.out.println("Area of Plot B        :" + plotAreaB);
        Estimator.printEstimatorDetailsB(plotAreaB, "B", plotB);

        System.out.println("*********************PRINT SECTOR C INFORMATION***********************");
        Plot plotC = new Plot("C", 3, 12, 15, 1);
        //invoking toString meyhods and print Sector A info.............
        System.out.println(plotC.toString());
        double plotAreaC = plotC.getPlotArea();
        System.out.println("Area of Plot  C         :" + plotAreaC);
        Estimator.printEstimatorDetailsC(plotAreaC, "C", plotC);

    }

}
