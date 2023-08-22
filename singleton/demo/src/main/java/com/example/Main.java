package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DatabaseConnector databaseConnector = DatabaseConnector.getInstance();
        System.out.println("Database connector = "+databaseConnector);

        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();
        System.out.println("Database connector = "+databaseConnector2);
    }
}