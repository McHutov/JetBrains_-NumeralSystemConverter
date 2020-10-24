package converter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sourceR = "";
        String sourceN = "";
        String targetR = "";
        double sum = 0;

        if(s.hasNextInt()){
            sourceR = String.valueOf(s.nextInt());
        }else{
           System.out.println("error");
           System.exit(0);
        }
        if(s.hasNext()){
            sourceN = s.next();
        }else{
            System.out.println("error");
            System.exit(0);
        }
        if(s.hasNextInt()){
            targetR = String.valueOf(s.nextInt());
        }else{
            System.out.println("error");
            System.exit(0);
        }

        if(Integer.parseInt(sourceR) < 1 || Integer.parseInt(sourceR) > 36){
            System.out.println("error");
            System.exit(0);
        }
        if(Integer.parseInt(targetR) < 1 || Integer.parseInt(targetR) > 36){
            System.out.println("error");
            System.exit(0);
        }
            if (sourceN.contains(".")) {
                if (Integer.parseInt(sourceR) == 10) {
                    String[] str = sourceN.split("\\.");
                    double d1 = Double.parseDouble(sourceN);
                    str[1] = "" + (d1 - ((int) d1));
                    sourceN = str[1];

                    if (Integer.parseInt(str[0]) != 0) {
                        converter(sourceR, String.valueOf(Integer.parseInt(str[0])), targetR);
                        System.out.print(".");
                    } else {
                        System.out.print("0.");
                    }
                    if (Integer.parseInt(sourceR) != 10) {
                        for (int i = 2; i < sourceN.length(); i++) {
                            sum += Double.parseDouble(String.valueOf(sourceN.charAt(i))) / Math.pow(7, i - 1);
                        }
                    } else {
                        sum = Double.valueOf(sourceN);
                    }

                    for (int i = 0; i < 5; i++) {
                        sum *= Integer.parseInt(targetR);
                        String a = String.valueOf((int) sum);
                        if (Integer.parseInt("10") != 1) {
                            int result = Integer.parseInt(a, Integer.parseInt("10"));
                            System.out.print(Integer.toString(result, Integer.parseInt(targetR)));
                        }
                        sum -= (int) sum;
                    }
                } else {
                    String str = sourceN.substring(0, sourceN.indexOf("."));

                    converter(sourceR, str, targetR);
                    System.out.print(".");
                    for (int i = sourceN.indexOf(".") + 1, j = 1; i < sourceN.length(); i++, j++) {
                        sum += Character.getNumericValue(sourceN.charAt(i)) / Math.pow(Integer.parseInt(sourceR), j);
                    }
                    for (int i = 0; i < 5; i++) {
                        sum *= Integer.parseInt(targetR);
                        if (Integer.parseInt(targetR) != 1) {
                            System.out.print(Character.forDigit((int) sum, Integer.parseInt(targetR)));
                        }
                        sum -= (int) sum;
                    }
                }
            } else {
                converter(sourceR, sourceN, targetR);
            }
    }
    public static void converter(String sourceR, String sourceN, String targetR){

        if (Integer.parseInt(targetR) == 1) {
            int result = Integer.parseInt(sourceN, 10);
            for (int i = 0; i < result; i++) {
                System.out.print(1);
            }
        }else{
            if (Integer.parseInt(sourceR) != 1) {
                int result = Integer.parseInt(sourceN, Integer.parseInt(sourceR));
                System.out.print(Integer.toString(result, Integer.parseInt(targetR)));
            }else{
                if (Integer.parseInt(sourceR) == 1) {
                    int size = sourceN.length();
                    int result = Integer.parseInt(String.valueOf(size), 10);
                    System.out.print(Integer.toString(result, Integer.parseInt(targetR)));
                }
            }
        }

    }

    }
