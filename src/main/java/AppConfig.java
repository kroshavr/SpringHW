import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "Car")
    public Car getCarBean() {
        return new Car("BMW");
    }

    @Bean(name = "Bus")
    public Bus getBusBean() {
        return new Bus("Scania");
    }

    @Bean(name = "Pickup")
    public Pickup getPickupBean() {
        return new Pickup("Ford");
    }
}