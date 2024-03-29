package Design.patterns.factory.example.database;

public class MongoDBQuery implements Query{
    @Override
    public void executeQuery() {
        System.out.println("Executing MongoDB query");
    }
}
