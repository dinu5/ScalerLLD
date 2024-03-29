package Design.patterns.factory.example.database;

public class MysqlFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
