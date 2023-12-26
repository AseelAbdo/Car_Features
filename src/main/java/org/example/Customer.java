package org.example;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Customer {
    private Integer customerId;

    private boolean accountActive = false;
    private String username;
    private String email;
    private String password;

    public ArrayList<Product> products = new ArrayList<>();
    public ArrayList<Appointment> app = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(Customer.class.getName());

    public Customer(Integer customerID, String username, String emailAddress, String password) {
        this.username = username;
        this.email = emailAddress;
        this.password = password;
        this.customerId = customerID;
        this.accountActive = true;
    }

    public static void displayByCat(ArrayList <Product> Products, String cat) {
       boolean flag = false;
       ArrayList<Product> temp = new ArrayList<>();

    for (Product product : Products) {
        if (product.category.equals(cat)) {
            temp.add(product);
            flag = true;
        }
    }

        if (!flag) {
logger.info(String.format("No products found in the category: %s", cat));
        } else {
logger.info(String.format("Products in the category %s:", cat));
            for (Product product : temp) {
                logger.info("Product Name: " + product.getName());
                logger.info("Product Price: " + product.getPrice());
                logger.info("Product Description: " + product.getProduct_Description());
                logger.info("Product Image: " + product.getImages());
            }

        }
    }


    public void updatEmail(String string2) {
        this.email = string2;

    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public static String getNotificationRecipient() {
        return "You order is successfully updated";
    }


    public String getUsername() {

        return username;
    }
    public  ArrayList<Appointment> getApp() {

        return app;
    }

    public String getEmail() {

        return email;
    }


    public void displayByFilter(ArrayList<Product> products2, Integer int1, Integer int2) {

        for (Product product : products2) {
            if (product.getPrice() >= int1 && product.getPrice() <= int2) {
                logger.info("Product Name: " + product.getName());
                logger.info("Price: $" + product.getPrice());
                logger.info("Availability: " + product.getAvailability());
                logger.info("Category: " + product.getCategory());
                logger.info("Images:");
                logger.info("\t" + product.getImages());
            }
            logger.info("-------------------------------");
        }
    }

    public void updateUsername(String string2) {
        this.username = string2;
    }

    public String getPass() {
        return this.password;
    }
    public Integer getID() {
        return this.customerId;
    }


    public void updatePassword(String string2) {
        this.password = string2;
    }

    public void addProduct(Product product) {
        products.add(product);
    }



}









