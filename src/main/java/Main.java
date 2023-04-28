import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        car.start();

        Bus bus = context.getBean(Bus.class);
        bus.start();

        Pickup pickup = context.getBean(Pickup.class);
        pickup.start();
    }
}
