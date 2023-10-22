package inhert;

import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.println("Enter 3 numbers for the roots");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(give(a, b, c));

        if (arr.isEmpty()) {
            System.out.println("No roots");
        } else {
            System.out.println(arr);
        }
        System.out.println();

        System.err.println("enter the number to check if it's even or odd");
        System.out.println(evenOrOdd(in.nextInt()));
    }

    public static ArrayList<String> give(double a, double b, double c) {
        ArrayList<String> res = new ArrayList<>();
        if (a == 0) {
            return res;
        }
        double insideRoot = Math.pow(b, 2) - (4 * a * c);

        if (insideRoot > 0) {
            double x1 = (-b + Math.sqrt(insideRoot)) / (2 * a);
            double x2 = (-b - Math.sqrt(insideRoot)) / (2 * a);
            res.add(String.valueOf(x1));
            res.add(String.valueOf(x2));
        } else if (insideRoot == 0) {
            double x = -b / (2 * a);
            res.add(String.valueOf(x));
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-insideRoot) / (2 * a);
            String complexRoot1 = realPart + " + " + imaginaryPart + " i";
            String complexRoot2 = realPart + " - " + imaginaryPart + " i";
            res.add(complexRoot1);
            res.add(complexRoot2);
        }

        return res;
    }

    public static String evenOrOdd(int n) {
        return n % 2 == 0 ? "even" : "odd";
    }
}