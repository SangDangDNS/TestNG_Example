import org.testng.annotations.Test;

public class DepencencyExample {

    @Test
    void startCar()
    {
        System.out.println("Car started");
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"})
    void parkCar()
    {
        System.out.println("Car parked");
    }
}
