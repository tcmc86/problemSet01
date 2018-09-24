import javax.swing.*;

import static java.lang.StrictMath.sqrt;

public class Ex5 {
    public static void main(String[] args) {

        float a = 1f, b = 6f, c = -16, x;


        x = (float) ((-b + sqrt((Math.pow(b,2))-4f*a*c))/(2f*a));

        JOptionPane.showMessageDialog(null,"X is equal to: " + x,"Results",JOptionPane.INFORMATION_MESSAGE);
    }
}
