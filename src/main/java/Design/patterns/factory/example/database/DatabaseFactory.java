package Design.patterns.factory.example.database;

//we will have all the factory methods in this factory interface
public interface DatabaseFactory {
    public Query createQuery();

}
