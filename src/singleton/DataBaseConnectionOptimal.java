package singleton;

public class DataBaseConnectionOptimal {
    private static DataBaseConnectionOptimal instance = null;
    private DataBaseConnectionOptimal(){}

    public static DataBaseConnectionOptimal getInstance(){
        if (instance == null){
            synchronized (DataBaseConnectionOptimal.class){
                if (instance == null){
                    instance = new DataBaseConnectionOptimal();
                }
            }
        }return  instance;


    }
}
