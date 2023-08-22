package com.example;

/*singleton rules:
 * we need to have a private constructor
 * we need to have a static private atribute
 * we need to have a public static method that returns the instance (or create the instance in case it doesn't exist)
 * we made syncronized the method getInstance to prevent to diferent threads to access at the same time to the same object because it could cause the creation of more than one instance
 */

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("creating object");
    }

    public static synchronized DatabaseConnector getInstance(){
        if (databaseConnector==null) {
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    }
}
