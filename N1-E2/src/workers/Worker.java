package workers;

public abstract class Worker {
    protected String firstName;
    protected String lastName;
    protected double hourlyRate;

    public Worker(String firstName, String lastName, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int workedHours) {
        return workedHours * getHourlyRate();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an obsolete method in Worker.");
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Hourly Rate: " + hourlyRate;
    }
}



