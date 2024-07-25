package vipul;

public class Hash {
    public static void main(String[] args) {
        String str="Vipul";
        int val=str.hashCode();
        System.out.println(val);
        str="Vipul";
        int val1=str.hashCode();
        System.out.println(val1);
    }
}
