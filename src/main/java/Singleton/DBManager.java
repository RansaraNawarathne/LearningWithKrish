package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
    /*private static volatile DBManager dbManager = new DBManager();

     private DBManager () {

     }

    public static DBManager getDbManager() {
        return dbManager;
    }*/

    //In this method sometimes (edge case) while first thread creating the dbManger instance, if the second instance start it will signal the second thread still instances is not created because its first tread still creating the instance.
    /*private static volatile DBManager dbManager;

    private DBManager (){
        if (dbManager != null){
            throw new RuntimeException("Please use getDBManger Method");
        }
    }

    public static DBManager getDbManager () {
        if (dbManager == null) {
            dbManager = new DBManager();
        }

        return dbManager;
    }*/

    //This synchronous method will block the second thread creating the instance while the first thread terminated. After the termination of first threat it will check whether the instance is null or not.
    //Double Checking Singleton Method
    /*private static volatile DBManager dbManager;

    private DBManager () {
        if (dbManager != null ) {
            throw new RuntimeException("Please use getDBManager Method");
        }
    }

    public static DBManager getDbManager () {
        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null ) {
                    dbManager = new DBManager();
                }
            }
        }

        return dbManager;
    }*/

    //Real world example
    private static volatile DBManager dbManager;
    private static volatile Connection connection;

    private DBManager () {
        if ( dbManager != null ) {
            throw new RuntimeException("Please use getDBManager Method");
        }
    }

    public static DBManager getDbManager() {
        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }

    public Connection getConnection () {
        if (connection == null ) {
            synchronized (DBManager.class) {
                if (connection == null ) {
                    String url = "jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }
}
