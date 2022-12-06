public class Main {
    public static void main(String[] args) {
        Engine engine= new Engine(3,"Audi",124);
        int a=3;
        System.out.println(engine.pojemnosc(a));
        System.out.println(engine);
        Engine engine1=new Engine();
        engine1.setMoc(124);
        engine1.setPojemosc(4);
        engine1.setRodzaj("Diesiel");
        System.out.println(engine1);
        Car car=new Car();
        car.test();
    }
}