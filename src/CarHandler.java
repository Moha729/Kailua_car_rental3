public class CarHandler implements MoCRUDc {

    MoTools tools = new MoTools();

    @Override
    public Car create() {
        String registrationNumber = tools.returnStringInfo(50,1,"Enter registration number");
        String brand = tools.returnStringInfo(50, 1,"Enter brand");
        String model = tools.returnStringInfo(50, 1,"Enter model");
        String registraionDate = tools.returnStringInfo(50, 1,"Enter registration date");
        int kmDriven = tools.returnIntInfo(50, 1,"Enter km driven");

        Car newCar = new Car(brand, model, registrationNumber, registraionDate, kmDriven);

        DBHandler dbHandler = new DBHandler();
        dbHandler.addCarToDB(newCar);

        return newCar;
    }


    @Override
    public void read() {
        DBHandler dbHandler = new DBHandler();
        dbHandler.readCarFromDB();

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
