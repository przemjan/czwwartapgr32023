package podstawy;

public class StringDemo {
    public static void main(String[] args) {

        String name = "Cezary";

        int length;

        length = name.length();

        char initial = name.charAt(0);

        String duze, male;

        name = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println(name);

    }
}
