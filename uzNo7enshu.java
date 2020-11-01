public class uzNo7enshu {
    public static void main (String[]args) {
        int a = 100;
        double b = 1.5;
        String c = "7";
        double d = 1.2;

        System.out.println(Integer.parseInt((int)(a+b)+c)+d);
        // ポイント　一時的にcはintだが扱いはStirng型であり、printlnの
        // 文として成り立たせているだけで、計算はa+bの101にそのままcをくっ付けて
        // 1017になっている

    }
}
