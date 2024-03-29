package Design.patterns.factory.example.database;

public class Client {
    public static void main(String[] args) {
        Database db = new MongoDB();
        DatabaseFactory dbf = db.getFactory();
        Query query = dbf.createQuery();
        query.executeQuery();

        System.out.println("DEBUG");
    }
}
