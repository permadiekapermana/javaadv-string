public class StrValueOf {
    public static void main(String[] args) {
        String kalimat = "Fungsi ini akan mengembalikan berbagai bentuk macam nilai ke dalam bentuk String";
        System.out.println(kalimat + "\n");

        // Boolean
        Boolean bool = false;
        System.out.println("Boolean :");
        System.out.println(String.valueOf(bool)+"\n");

        // Char
        char sample = 'a';
        System.out.println("Char :");
        System.out.println(String.valueOf(sample) + "\n");

        // Char Array
        char[] charArray = {'a','b','c','d'};
        System.out.println("Char Array :");
        System.out.println(String.valueOf(charArray) + "\n");

        // Int
        int integer = 1000;
        System.out.println("Integer :");
        System.out.println(String.valueOf(integer)+"\n");

        // Char Long
        long charLong = 1996;
        System.out.println("Char Long :");
        System.out.println(String.valueOf(charLong) + "\n");

        // Double
        double doubleNumber = 9.8;
        System.out.println("Double :");
        System.out.println(String.valueOf(doubleNumber) + "\n");

        // Float
        float floatNumber = 0.4f;
        System.out.println("Float :");
        System.out.println(String.valueOf(floatNumber));
    }
}
