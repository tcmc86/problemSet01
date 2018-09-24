import javax.swing.*;

public class Ex1 {
    public static void main(String[] args) {

        String poundsAsString;
        int count=1;
        double euro = 0, pounds;
        final float EXCHANGE = 1.13f;

        poundsAsString = JOptionPane.showInputDialog(count + ". Please enter the ammount in pounds: ");
        pounds = Double.parseDouble(poundsAsString);

        while(pounds != 0){

            euro = (pounds/EXCHANGE);
            count++;


            poundsAsString = JOptionPane.showInputDialog(count + ". Please enter the ammount in pounds: ");
            pounds = Float.parseFloat(poundsAsString);
        }

        JOptionPane.showMessageDialog(null,"The conversion rate is:" +"\n\nPounds: " + String.format("%.2f",pounds) +"\nEuro: " + String.format("%.2f",euro),"Results",JOptionPane.INFORMATION_MESSAGE);
    }
}
