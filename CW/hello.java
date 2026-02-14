import java.util.Arrays;

public class hello {
    public static void main(String[] args) {

        String[] name = { "Ashish", "Adarsh", "Ankit" };

        Arrays.stream(name).map(s -> s + " ").forEach(System.out::print);
    }
}