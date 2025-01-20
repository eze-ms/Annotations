package workers;

public class OnsiteWorker extends Worker {
    public static double fuelCost = 30.0;

    public OnsiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int workedHours) {
        return super.calculateSalary(workedHours) + fuelCost;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an obsolete method in OnsiteWorker.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Onsite Worker";
    }
}

