package singleton;

public class DatabaseConnectionRuntime {
    private  static DatabaseConnectionRuntime instance = null;
    private DatabaseConnectionRuntime(String param){

    }

    public static DatabaseConnectionRuntime getInstance() {
        if (instance == null){
            instance = new DatabaseConnectionRuntime("prod");
        }

        return instance;
    }
}
/*
    1. this will create instance at runtime,but it is not thread safe.
 */