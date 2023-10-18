package Strategy;

public class MoutainDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("This is mountain ride Strategy");
    }
}
