package item10.infiniteRecursion;

import java.awt.*;

/**
 * Created by jyami on 2020/01/19
 */
public class Main {
    public static void main(String[] args) {
        SmellPoint smellPoint = new SmellPoint(1,2);
        ColorPoint colorPoint = new ColorPoint(1,2, Color.BLACK);

        colorPoint.equals(smellPoint);
    }
}
