import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true){
        Scanner input = new Scanner(System.in);
            float max = 1;
            float min = 50000000;

            System.out.println("wpisz cyfre !!!");
            String slowo = input.nextLine();
            String[] strArray = null;
            strArray = slowo.split(" ");
            int size = strArray.length;
            int[] strArray1 = new int[size];
            for (int i = 0; i < size; i++) {
                strArray1[i] = Integer.parseInt(strArray[i]);
            }
            max = strArray1[0];
            for (int i = 0; i < strArray1.length; i++) {
                if (strArray1[i] > max) {
                    max = strArray1[i];
                }
            }
            System.out.println("Największa wartośc to: " + max);

            for (int i = 0; i < strArray1.length; i++) {
                if (strArray1[i] < min) {
                    min = strArray1[i];
                }
            }

            System.out.println("Najmiejsza wartośc to: " + min);

            if(strArray1[0] == 0){

                System.exit(1);
        }

}
}
}
