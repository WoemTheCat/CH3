public class Sample3_23 {
    public static void main(String[] args) {
        Car car1;
        car1 = new Car();

        car1.show();

        car1.setCar(1234, 20.5);
        car1.setName("1號車");

        car1.show();
    }
}

class Car {

    private int num;
    private double gas;
    private String name;

    public Car() {
        this.num = 0;
        this.gas = 0.0;
        this.name = "沒有名稱";
        System.out.println("生產了車子");
    }

    public void setCar(int n, double g) {
        this.num = n;
        this.gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }

    public void setName(String nm) {
        this.name = nm;
        System.out.println("將車名設為" + this.name);
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
        System.out.println("車名是" + this.name);
    }
}