CREATE TABLE IF NOT EXISTS SYSTEM_ADMIN (
    Admin_ID INT PRIMARY KEY,
    Admin_Username VARCHAR(50) NOT NULL UNIQUE,
    Admin_Password VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS PRODUCT (
    Product_ID VARCHAR(50) PRIMARY KEY,
    Product_BrandName Varchar(50),
    Product_Name VARCHAR(50) NOT NULL,
    Product_Price DECIMAL(10, 2) NOT NULL,
    Product_Quantity INT NOT NULL,
    Product_Category Varchar(10) NOT NULL,
	Product_SubCategory Varchar(10) NOT NULL,
    Product_Image BLOB
);


CREATE TABLE IF NOT EXISTS CLIENT (
    Client_ID INT PRIMARY KEY AUTO_INCREMENT,
    Client_Name VARCHAR(50) NOT NULL,
    Client_Mobile_Number VARCHAR(11) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS SALES (
    Sales_ID INT PRIMARY KEY AUTO_INCREMENT,
    Sales_Date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Client_ID INT,
    Sales_Total_Amount DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (Client_ID) REFERENCES CLIENT(Client_ID)
);

CREATE TABLE IF NOT EXISTS SALES_DETAILS (
    Sales_Details_ID INT PRIMARY KEY AUTO_INCREMENT,
    Sales_ID INT,
    Product_ID Varchar(50),
    Sales_Quantity INT NOT NULL,
    Sales_Sub_Total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (Sales_ID) REFERENCES SALES(Sales_ID),
    FOREIGN KEY (Product_ID) REFERENCES PRODUCT(Product_ID)
);

--insert into system_admin (Admin_ID, Admin_Username, Admin_Password) values (42163, "admin", "123");