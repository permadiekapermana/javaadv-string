public class StrEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Javascript and Java IS different";
        String str2 = "Javascript and Java is Different";
        // fungsi equalsIgnoreCase akan mengabaikan case sensitif
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
