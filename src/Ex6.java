public class Ex6 {
    public static void main(String[] args) {

        int number = 1;
        String answer = "Number\t\tCube\n" +
                "-----\t\t-----\n";

        while(number<=15) {
            answer += "  " + number + "\t\t\t\t" + cube(number) + "\n";

            number++;
        }

        System.out.println(answer);

    }

    public static int cube(int number){

        int cube = number * number * number;

        return cube;
    }
}
