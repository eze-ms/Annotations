package workers;

public class OnlineWorker extends Worker {
    public static final double internetFee = 50.0;

    public OnlineWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);
    }

    @Override
    public double calculateSalary(int workedHours) {
        return super.calculateSalary(workedHours) + internetFee;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an obsolete method in OnlineWorker.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Online Worker";
    }
}

// deprecation // Suprime los warnings para el uso de métodos obsoletos