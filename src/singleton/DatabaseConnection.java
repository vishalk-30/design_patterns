package singleton;

public class DatabaseConnection {
    private static final DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection(){

    }
    public static DatabaseConnection getInstance(){
        return instance;
    }
}
/*
     1. this is always create instance at compile time, and it increases the app start time
     2. if we want to provide any param to constructor can't be possible

 */