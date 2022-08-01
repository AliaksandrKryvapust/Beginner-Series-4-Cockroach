public class Source {
    public static void main(String[] args) {
        double speed = 1.08;
        System.out.println(cockroachSpeed(speed)==30);
    }
    public static int cockroachSpeed(double x){
        return (int) Math.floor(x*100000/3600);
    }
}
