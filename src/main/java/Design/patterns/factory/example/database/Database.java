package Design.patterns.factory.example.database;


// we could have declare all the factory methods here as well
// but it will violate SRP principle,
// so we move all the factory interface to another separate interface
public interface Database {
    public void refreshDB();
    public void closeDB();
    public DatabaseFactory getFactory();
}
