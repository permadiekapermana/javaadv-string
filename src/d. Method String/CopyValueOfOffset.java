public class CopyValueOfOffset {
    public static void main(String[] args) {
        String str = "Hello World";
		char[] arr = {'H','e','l','l','o',' ','J','a','v','a'};
        System.out.println(str.copyValueOf(arr, 0, 7));
        System.out.println(str.copyValueOf(arr, 1, 9));

    }
}
