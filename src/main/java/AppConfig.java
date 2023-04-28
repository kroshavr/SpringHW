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

    @Bean (name = "driverCar")
    public Driver getDriverCarBean(){
        return new Driver("Jon", getCarBean());
    }
    @Bean (name = "driverBus")
    public Driver getDriverBusBean(){
        return new Driver("Liam", getBusBean());
    }
    @Bean (name = "driverPickup")
    public Driver getDriverPickupBean(){
        return new Driver("Jon", getPickupBean());
    }
}