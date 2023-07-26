
public class Ex2 {
    public static void main(String[] args) {
        double s = Double.parseDouble(args[0]);
//        double theta = toRadians(s);
        double vs = Math.sin(s);
        double vc = Math.cos(s);
        double res = vs * vs + vc * vc;
        boolean isEqualToOne;
        isEqualToOne = (res == 1.0);
        System.out.println(isEqualToOne);
        System.out.println(res);

    }
}
