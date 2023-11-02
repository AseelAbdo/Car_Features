package org.example;

import java.util.ArrayList;
import java.lang.*;
public class MyAppT {
    static ArrayList<Category> ArrayList = new ArrayList<>();
    static ArrayList<Product> ArrayList2 = new ArrayList<>();
    public static boolean isSystemReady;
    public static boolean exists;
    private static boolean systemReady;



    public MyAppT() {

        isSystemReady = false;
        exists = false;
        systemReady = true;
    }


    public static boolean createCategory(String string) {
        Category c = null; // Initialize c to null
        boolean categoryExists = false;

        for (int i = 0; i < ArrayList.size(); i++) {
            if (ArrayList.get(i).equals(string)) {
                System.out.println("Category already exists");
                categoryExists = true;
                break;
            }
        }

        if (!categoryExists) {
            c = new Category(string);
            ArrayList.add(c);
        }

        if (c != null) {
            return c.flag;
        } else {
            return false;
        }


    }

    public static boolean ExistCategory(String string) {

        for (int i = 0; i < ArrayList.size(); i++) {
            if (ArrayList.get(i).equals(string))
                exists = true;
            else
                exists = false;

        }
        return exists;
    }

    public static boolean AdminFills() {

        boolean flag;
        Product P = new Product();
        flag = P.Admin_Fill();

        return flag;
    }

    public static boolean isCheckedPrice(String string) {
        boolean flag;
        String s = string.toLowerCase();
        try {

            int intValue = Integer.parseInt(string);
            if (intValue > 0) {
                flag = true;  // Valid price
            } else {
                System.out.println("Invalid Price: Price must be greater than 0!");
                flag = false;
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid Price: Input is not a valid integer.");
            e.printStackTrace();
            flag = false;
        }

        return flag;
    }

    public static boolean isCheckedAvailability(String string) {
        boolean flag;
        String s = string.toLowerCase();
        try {
            int intValue = Integer.parseInt(string);
            if (intValue >= 0) {
                flag = true;
            } else {
                System.out.println("Invalid Availability: Availability must be greater or  equal 0!");
                flag = false;
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid Availability: Input is not a valid integer.");
            e.printStackTrace();
            flag = false;
        }

        return flag;
    }

    public static boolean isCheckedDescription(String string) {
        boolean flag;
        try {
            string.toLowerCase();

            if (Character.isDigit(string.charAt(0)) || string.isEmpty()) {
                System.out.println("Invalid Product Description");
                flag = false;

            } else {
                flag = true;
            }

        } catch (java.lang.Exception E) {
            E.printStackTrace();
            flag = false;
            System.out.println("Invalid Description.");
        }

        return flag;

    }

    public static boolean isCheckedExtension(String string2, String string3) {
        boolean flag;
        try {
            if (string3.toLowerCase().endsWith(".png") || string2.toLowerCase().endsWith(".jpg"))
                flag = true;
            else {
                System.out.println("Invalid Image Extension.");
                flag = false;
            }
        } catch (java.lang.Exception E) {
            E.printStackTrace();
            flag = false;
        }

        return flag;
    }


    public static boolean SavedSuccessfully() {
        boolean flag;
        Product P = new Product();
        P.Admin_Fill();
        String s1 = P.image;
        String s2 = P.availability;
        String s3 = P.price;
        String s4 = P.product_descriptions;
        String s5 = P.product_descriptions;

        try {
            if (isCheckedAvailability(s2) && isCheckedDescription(s4) && isCheckedExtension(s1, "") && isCheckedPrice(s3)) {
                ArrayList2.add(new Product(s1, s3, s4, s2,s5));
                flag = true;

            } else {
                flag = false;
            }
        } catch (Exception E) {
            E.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public static boolean ViewMessage(String message) {
        String lowercaseMessage = message.toLowerCase();
        boolean flag = false; // Initialize to false by default

        try {
            if (lowercaseMessage.equals("image")) {
                flag = !isCheckedExtension(message, null);
            } else if (lowercaseMessage.equals("price")) {
                flag = !isCheckedPrice(message);
            } else if (lowercaseMessage.equals("availability")) {
                flag = !isCheckedAvailability(message);
            } else if (lowercaseMessage.equals("detailed product descriptions")) {
                flag = !isCheckedDescription(message);
            }
        } catch (Exception e) {
            // Handle the specific exception if it's thrown
            flag = false;
        }

        return flag;
    }

    public static boolean isSystemReady() {
        return systemReady;
    }
    public boolean isNotReady() {
        return !systemReady;
    }
}



