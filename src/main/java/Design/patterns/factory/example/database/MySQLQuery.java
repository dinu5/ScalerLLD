package Design.patterns.factory.example.database;

public class MySQLQuery implements Query{
    @Override
    public void executeQuery() {
        System.out.println("Executing Mysql query");
    }
}
