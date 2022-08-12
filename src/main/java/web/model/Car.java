package web.model;

public class Car {
    private String brend;
    private String model;
    private int yearOfRelease;
    private int idCars;


    public Car(int idCars, String brend, String model, int yearOfRelease) {
        this.idCars = idCars;
        this.brend = brend;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getIdCars() {
        return idCars;
    }

    public void setIdCars(int idCars) {
        this.idCars = idCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
