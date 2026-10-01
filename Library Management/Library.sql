CREATE DATABASE library;

USE library;

CREATE TABLE Book (
    BookID INT PRIMARY KEY,
    Title VARCHAR(100),
    Author VARCHAR(100),
    Price DOUBLE,
    Availability BOOLEAN
);
