import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> sequence = new ArrayList<>();
        while (true) {
            String a = s.next();
            if (a.equals("0")) {
                break;
            } else {
                sequence.add(a);
            }
        }
        for (String str: sequence) {
            try {
                System.out.println(Integer.parseInt(str) * 10);
            }catch (Exception e){
                System.out.println("Invalid user input: " + str);
            }
        }
    }
}