import java.util.ArrayList;
import java.util.Scanner;
import  java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("lemon");
        Scanner sc = new Scanner(System.in);
        System.out.println("вееди чило");
        int n = sc.nextInt();
        System.out.println(list.get(n));
    }
}