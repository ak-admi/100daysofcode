package Day3;

public class CC {
    public static boolean isELgible(Double dis, String status) {
        if (dis < 1 || status == "active" && dis > 10 || status == "inactive" && dis > 5) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isELgible(0.5, "active"));
        System.out.println(isELgible(5.0, "active"));
        System.out.println(isELgible(10.0, "inactive"));

    }

}
