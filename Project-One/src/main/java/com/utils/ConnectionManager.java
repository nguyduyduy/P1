package com.utils;//import com.sun.jdi.connect.spi.Connection;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {

    // this is a singleton meaning when we call this instance we are always
    // referring to the same instance of this com.Utils.ConnectionManager class
    public static ConnectionManager connectionManager;

    // this is our Connection instance
    public static Connection connection;


    // this is a private constructor
    private ConnectionManager() {

    }

    private ConnectionManager getConnectionManager() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }

        return connectionManager;
    }

    public static Connection getConnection() {
        if (connection == null) {
            connection = connect();
        }
        return connection;
    }

    private static Connection connect() {

        try {

            // this creates a new properties list with no values
            Properties props = new Properties();

            // we are using the FileReader method to read the contents of our jdbc.properties file
            FileReader fileReader = new FileReader("/Users/nguyr/Documents/P1/Project-One" + "/src/main/resources/jdbc.properties");

            // by loading the contents of the file into the properties list
            // we can now access the values at the keys that we have set on the properties list
            props.load(fileReader);

            // the database URL is an address pointing to the database to be used
            // also known as the JDBC string. The format of this URL varies between
            // database vendors or DBMS
            // for Postgres the url we are creating consists of
            // jdbc:postgresql://hostname:port//databaseName"

            StringBuilder sb = new StringBuilder();
            sb.append("jdbc:postgresql://");
            sb.append(props.get("hostname"));
            sb.append(":");
            sb.append(props.get("port"));
            sb.append("/");
            sb.append(props.get("database"));

            // in order for us to use the string we have created we have to call
            // the .toString method on the sb (StringBuilder)
            // just for better looking code we assigned sb.toString
            // to connectionURL as opposed to
            String connectionURL = sb.toString();

            String user = String.valueOf(props.get("user"));

            String password = String.valueOf(props.get("password"));


            System.out.println(connectionURL.toString());

            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(connectionURL, user, password);


            System.out.println(connection.getClientInfo().toString() + "This is to confirm the connection was made");

            // The database URL is an address pointing to the database to be used
            // also known as the JDBC string
        } catch (Exception e) {

            System.out.println("Error in the connection " + e.getMessage());

        }


        return connection;
    }

    // private get method to initialize the connectionManager instance on line 9

}
