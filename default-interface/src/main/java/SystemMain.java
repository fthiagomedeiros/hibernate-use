public class SystemMain {

    public static void main(String[] args) {
        Veiculo v = new Gol();
        String m = v.accelerator();
        System.out.println(m);

        Veiculo maverick = new Maverick();
        String m1 = maverick.accelerator();
        System.out.println(m1);
    }

}
