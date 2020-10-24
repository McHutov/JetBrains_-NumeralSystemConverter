import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int sum1 = Integer.parseInt(String.valueOf(str.charAt(0))) + Integer.parseInt(String.valueOf(str.charAt(1))) + Integer.parseInt(str.valueOf(str.charAt(2)));
        int sum2 = Integer.parseInt(String.valueOf(str.charAt(3))) + Integer.parseInt(String.valueOf(str.charAt(4))) + Integer.parseInt(str.valueOf(str.charAt(5)));

        if(sum1 == sum2){
            System.out.println("Lucky");
        }else{
            System.out.println("Regular");
        }
    }
}