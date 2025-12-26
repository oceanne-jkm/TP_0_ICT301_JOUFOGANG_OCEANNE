package ict301.solid.dip.old;

class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

public class OrderProcessor {
    private MySQLDatabase database;

    public OrderProcessor() {
        this.database = new MySQLDatabase(); // Dépendance directe sur concret
    }

    public void processOrder(String order) {
        database.save(order);
    }
}

// Exemple d'utilisation
public class Main {
    public static void main(String[] args) {
        OrderProcessor order = new OrderProcessor();
        order.processOrder("Données à sauvegarder");
    }
}