public class Task {
    public static void main(String[] args) {
        String number = "211";
        System.out.println(parseAndSqrt(number));
    }

    public static long parseAndSqrt(String number) {
        long numberLong = Long.parseLong(number);
        return Math.round(Math.sqrt(numberLong));
    }
}

