package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public  class Product {
    ArrayList<Product> ProductList = new ArrayList<>();
    public String product_descriptions;
    public String name;
    public String price;
    public String image;
    public String availability;
    public String msg;
    boolean button;
     static boolean flag;


  public  Product() {
        product_descriptions = null;
        price = null;
        image = null;
        availability = null;
        msg = null;
        flag = false;
        button = false;
        name = null;
    }

    static Scanner s = new Scanner(System.in);


    public Product(String S1, String S2, String S3, String S4, String S5) {
        try {
            this.image = S1;
            this.price = S2;
            this.product_descriptions = S3;
            this.availability = S4;
            this.name = S5;
        } catch (Exception E) {
            System.err.println("Exception thrown");
        }
    }


    public boolean Admin_Fill() {

        try {
            System.out.println("Enter a description of this product ");
            product_descriptions = s.next();

            System.out.println("Enter the price of this product: ");
            price = s.next();

            System.out.println("Enter the availability of this product: ");
            availability = s.next();


            System.out.println("Enter image of this product: ");
            image = s.next();

            flag = true;
        } catch (Exception E) {

            flag = false;

        }

        return flag;
    }


    public static boolean UserList() {
        boolean flag;
        try {
            MyAppT P = new MyAppT();
            if (P.ArrayList2 == null) {
                flag = false;

            } else
                flag = true;
        } catch (Exception E) {
            flag = false;
        }
        return flag;
    }

    public static boolean ProductAppearance(String string) {

        MyAppT P = new MyAppT();
        boolean flag=false;

        try {

            for (int i = 0; i < P.ArrayList2.size(); i++) {
                if (P.ArrayList2.get(i).name.startsWith(string.substring(0))) {
                    flag = true;
                } else {
                    flag = false;
                }
            }

        } catch (Exception E) {
            flag = false;
        }
        return flag;
    }

    public static boolean PressedButton(String string) {
        try {
            flag =true;
        }
        catch (Exception E){
            flag =false;
        }
        return  flag;
    }

    public static boolean EnterAProduct(String string, String string2) {
        boolean flag;
        try {
          if(string.startsWith(string.substring(0)))
              flag =true;
          else flag =false;
        }
        catch (Exception E){
            flag =false;
        }
        return  flag;
    }

    public static boolean ProductAppearance_2(String string) {
        boolean f;
        boolean flag = ProductAppearance(string);
        if(flag){
            f = false;
        }
        else{
            f=true;
        }
        return flag;
    }
}
