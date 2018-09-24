import javax.swing.*;

public class Ex7 {
    public static void main(String[] args) {

        float number;
        String numberAsString;


        numberAsString = JOptionPane.showInputDialog("Please enter a number(-1 to exit: ");
        float number = Float.parseFloat(numberAsString);

        while(number != -1){

            if(isEven(number)==true){

                JOptionPane.showMessageDialog(null,"This number is even.","Result",JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null,"This number is odd.","Result",JOptionPane.INFORMATION_MESSAGE);

            numberAsString = JOptionPane.showInputDialog("Please enter a number(-1 to exit: ");
            number = Float.parseFloat(numberAsString);


        }



    private static boolean isEven(){


        float number;

        if(number%2==0)
        {
            return true;
        }
        else
            return false;
    }

}
