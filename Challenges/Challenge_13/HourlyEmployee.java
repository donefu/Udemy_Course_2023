package Challenge_13;

public class HourlyEmployee extends  Employee{
    private double hourlyPayrate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayrate) {
        super(name, birthDate, hireDate);
        this.hourlyPayrate = hourlyPayrate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayrate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}
