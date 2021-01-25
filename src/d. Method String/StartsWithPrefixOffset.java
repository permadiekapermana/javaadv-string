public class StartsWithPrefixOffset {
    public static void main(String[] args) {
        String str = "Javascript";
        // prefix = nilai stirng, offset = string ke ...
        System.out.println(str.startsWith("J",0));
        System.out.println(str.startsWith("a",3));
        // false
        System.out.println(str.startsWith("a",0));
        System.out.println(str.startsWith("f",3));
    }
}
