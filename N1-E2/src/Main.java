import workers.OnlineWorker;
import workers.OnsiteWorker;

@SuppressWarnings("deprecation") // Suprime los warnings para el uso de métodos obsoletos
public class Main {
    public static void main(String[] args) {
        OnlineWorker onlineWorker = new OnlineWorker("Anna", "Smith", 15.0);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Carlos", "Gomez", 18.0);

        System.out.println(onlineWorker);
        System.out.println("Salary for Anna: " + onlineWorker.calculateSalary(160) + "€");

        System.out.println(onsiteWorker);
        System.out.println("Salary for Carlos: " + onsiteWorker.calculateSalary(160) + "€");

        // Invoke deprecated methods
        onlineWorker.oldMethod();
        onsiteWorker.oldMethod();
    }
}