public class CompareToIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Javascript";
        String str2 = "JavaScript";
        // membandingkan kedua nilai dengan mengabaikan case sensitif
        System.out.println(str1.compareToIgnoreCase(str2));

        str1 = "Javascript is good";
        str2 = "JavaScript is hard";
        System.out.println(str1.compareToIgnoreCase(str2));
        // s dan S tetap sama
    }
}
