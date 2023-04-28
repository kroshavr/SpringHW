import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

      Driver driverCar = context.getBean("driverCar", Driver.class);
      driverCar.startTransport();

      Driver driverBus = context.getBean("driverBus", Driver.class);
      driverBus.startTransport();

      Driver driverPickup = context.getBean("driverPickup", Driver.class);
      driverPickup.startTransport();
    }
}
