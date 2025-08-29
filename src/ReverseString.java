public class ReverseString {
    public static void main(String[] args) {
        String name ="Harsh";
        StringBuilder reverse = new StringBuilder(name).reverse();
        System.out.println(reverse);

        //OR

        char[] arr = name.toCharArray();
        String rev = "";
        for (int i = arr.length -1; i >=0 ; i--) {
            rev+=arr[i];
        }
        System.out.println(rev);
    }
}
