package ict301.solid.dip;

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

public class OrderProcessor {
    private Database database;

    public OrderProcessor(Database database) { // Injection de dépendance sur abstraction
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}

// Exemple d'utilisation
public class Main {
    public static void main(String[] args) {
        Database database;

        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder");

        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("Données à sauvegarder");
    }
}