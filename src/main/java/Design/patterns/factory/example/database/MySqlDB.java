package Design.patterns.factory.example.database;

public class MySqlDB implements Database{
    @Override
    public void refreshDB() {
        System.out.println("Refreshing DB");
    }

    @Override
    public void closeDB() {
        System.out.println("closing db");
    }

    @Override
    public DatabaseFactory getFactory() {
        return new MysqlFactory();
    }
}
