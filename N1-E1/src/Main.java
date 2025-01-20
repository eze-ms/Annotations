import workers.OnlineWorker;
import workers.OnsiteWorker;

public class Main {
    public static void main(String[] args) {
        OnlineWorker onlineWorker = new OnlineWorker("Anna", "Smith", 15.0);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Carlos", "Gomez", 18.0);

        System.out.println(onlineWorker);
        System.out.println("Salary for Anna: " + String.format("%.2f", onlineWorker.calculateSalary(160)) + "€");

        System.out.println(onsiteWorker);
        System.out.println("Salary for Carlos: " + String.format("%.2f", onsiteWorker.calculateSalary(160)) + "€");
    }
}

