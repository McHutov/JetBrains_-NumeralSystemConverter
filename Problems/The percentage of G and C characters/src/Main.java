import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next().toLowerCase();
        int quantity = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == 'g' || str.charAt(i) == 'c'){
                quantity++;
            }
        }
        double precent = ((double)quantity * 100.0/(double)str.length());
        System.out.println(precent);

    }
}