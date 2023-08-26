package singleton;



public class DatabaseConnectionThreadSafe {
    private static DatabaseConnectionThreadSafe instance = null;

    private DatabaseConnectionThreadSafe(){}

    public synchronized static DatabaseConnectionThreadSafe getInstance(){
        if (instance==null){
            instance = new DatabaseConnectionThreadSafe();
        }return instance;
    }
}
/*
      It is thread safe but performance is poor because it will not  allow every thread to enter.
      if one thread is already created instance, but it will other thread to wait
 */