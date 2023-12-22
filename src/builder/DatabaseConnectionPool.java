package builder;

import java.util.Stack;

public class DatabaseConnectionPool {
    private String name;
    private String userName;
    private String password;
    private Integer port;
    private DatabaseType type;
    private boolean isCompressed;

    private DatabaseConnectionPool() {
    }

    public DatabaseConnectionPool(String name, String userName, String password, Integer port, DatabaseType type, boolean isCompressed) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.port = port;
        this.type = type;
        this.isCompressed = isCompressed;
    }

    public static Builder builder(){
        return  new Builder();
    }

    public static class Builder{
        private DatabaseConnectionPool databaseConnectionPool;
        public Builder(){
            databaseConnectionPool = new DatabaseConnectionPool();
        }

        public Builder name (String name){
            this.databaseConnectionPool.name = name;
            return this;
        }
        public Builder withCredentials(String userName, String password){
            this.databaseConnectionPool.userName = userName;
            this.databaseConnectionPool.password = password;
            return  this;
        }
        public Builder port(Integer port){
            this.databaseConnectionPool.port = port;
            return this;
        }
        public Builder mysql(){
            this.databaseConnectionPool.type = DatabaseType.MY_SQL;
            return this;
        }
        public Builder postgres(){
            this.databaseConnectionPool.type = DatabaseType.POSTGRES;
            return this;
        }
        public Builder mongo(){
            this.databaseConnectionPool.type = DatabaseType.MONGO;
            return this;
        }
        public  Builder isCompressed(){
            this.databaseConnectionPool.isCompressed = true;
            return this;
        }

        public DatabaseConnectionPool build(){
            if(valid()){
                return new  DatabaseConnectionPool(databaseConnectionPool.name, databaseConnectionPool.userName,
                        databaseConnectionPool.password, databaseConnectionPool.port, databaseConnectionPool.type, databaseConnectionPool.isCompressed);
            }
            throw new IllegalArgumentException("Wrong Port number is passed");


            }

        public boolean valid() {
            if (databaseConnectionPool.type == DatabaseType.MY_SQL) {
                return databaseConnectionPool.port == 3306;
            } return false;
        }

    }

}

