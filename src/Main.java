import java.util.Arrays;

public class Main {

    public static void main(String... args) throws DimensionException {
        Vector v = new Vector(new double[]{1, 2, 3, 4}, 0);
        Vector u = new Vector(new double[]{4, 3, 2, 1}, 0);
        Vector a = Utils.add(v, u);
        System.out.println(a);
    }

}
