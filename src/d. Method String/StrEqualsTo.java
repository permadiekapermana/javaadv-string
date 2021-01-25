public class StrEqualsTo {
    public static void main(String[] args) {
        String str1 = "Java dan Javascript itu berbeda";
        String str2 = "Java dan Javascript itu berbeda";
        // berfungsi untuk membandingkan value yang ada pada string
        // hasil outputnya adalah bollean
        System.out.println(str1.equals(str2));
        str2 = "Javascript";
        System.out.println(str1.equals(str2));
    }
}
