package Design.patterns.factory.example.database;

public class MongoDBFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MongoDBQuery();
    }
}
