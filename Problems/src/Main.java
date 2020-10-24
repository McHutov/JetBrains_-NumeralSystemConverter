import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ab");
        sb.append("bc");
        sb = sb.append("cd");

        System.out.println(sb);
    }
}