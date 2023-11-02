package org.example;

public class Category {
    public String Name;
    boolean flag;
    Category(String string) {
        if (!string.isEmpty()) {
            this.Name = string;
            flag = true;
        }
        else {
            flag =false;
            System.out.println("Enter a valid category");
        }
    }
}
