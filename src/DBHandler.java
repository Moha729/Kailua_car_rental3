import java.sql.*;

public class DBHandler {

    public final String jdbc_driver = "com.mysql.jdbc.Driver";
    public final String database_url = "jdbc:mysql://localhost:3306/kailua_car_rental";
    public Connection con;

    MoTools tools = new MoTools();

    public void addCarToDB(Car car){

        try {
            con = DriverManager.getConnection(database_url, "root", "Mohammad90%");
            Statement s = con.createStatement();
            s.execute("INSERT INTO car_table VALUES " +
                    "('" + car.getRegistrationNumber() +
                    "','" + car.getBrand() +
                    "','" + car.getModel() +
                    "','" + car.getRegistrationDate() +
                    "'," + car.getKmDriven() + ")");

            con.close();
            s.close();

        } catch (SQLException sqlException){
            System.out.println("ERROR ADD CAR - "+sqlException);
            System.exit(1);

        }


    }

    public void readCarFromDB(){

        tools.margeTop(70);
        System.out.printf("\n| %-14s %-14s %-12s %-12s %-12s |\n",
                "RegNumb", "Brand", "Model", "RegDate", "kmdriven");
        tools.margeTop(70);

        try {
            con = DriverManager.getConnection(database_url, "root", "Mohammad90%");
            Statement s = con.createStatement();
            ResultSet rs =s.executeQuery("SELECT * FROM car_table");

            if (rs != null){



                while (rs.next()){
                    System.out.printf("\n| %-14s %-14s %-12s %-12s %-12d |\n", rs.getString("registrationNumber")
                    , rs.getString("brand"), rs.getString("model")
                    , rs.getDate("registrationDate"), rs.getInt("kmDriven"));
                    tools.margeTop(70);
                }

            }

            s.close();
            con.close();
        }catch (SQLException sqlException){
            System.out.println("ERROR READ CAR - "+sqlException);
            System.exit(1);

        }
    }



}
