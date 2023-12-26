package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

public class Admin {
public Product p;
    private  String email;
    private  Integer adminID;

    private  String name;

    private  String password;
    private static final Logger logger = Logger.getLogger(Admin.class.getName());

    private ArrayList <Product> product = new ArrayList<>();
    private ArrayList <Customer> customers = new ArrayList<>();

    public ArrayList <String> category = new ArrayList<>();

    public  Admin(Integer adminID, String name,String email,String pass){
        this.name=name;
        this.adminID=adminID;
        this.email=email;
        this.password=pass;
    }

  public ArrayList getCatList(){
        return category;
  }





public   ArrayList getArray(){
        return product;
}

    public  void setEmail(String email2) {

        this.email = email2;

    }

    public  void setID(Integer id) {

        this.adminID = id;
    }



    public  void setName(String name) {

        this.name = name;

    }

    public  void setPassword(String password2) {

        password = password2;

    }

    public  String getUsername() {

        return name;
    }

    public  String getEmail() {

        return email;
    }
    public  Integer getID() {

        return adminID;
    }


    public ArrayList getProductList() {

        return product;
    }

    public  String getPassword() {

        return password;
    }

    public  void addProduct(Product product1) {

      product.add(product1);

    }

    public boolean searchCat(String string) {
        boolean flag =false;
        for(Product productName:product){
            if(productName.getCategory().equals(string)){
                flag =true;
            }
            else{
                flag =false;
            }
        }
        return flag;
    }


    public void updateCat( String oldCategory ,String newCategory) {

        for (int i = 0; i < category.size(); i++) {
            if (category.get(i).equals(oldCategory)) {
                category.set(i, newCategory);
            }
        }


    }

    public boolean searchProduct(String name) {
        boolean flag = false;
        for(Product productName : product){
            if(productName.getName().equals(name))
                flag = true;

        }
      return flag;
    }

    public void addCustomer (Customer customer){
        customers.add(customer);
    }

    public  boolean searchID(Integer customerID){
        boolean flag =false;
        for(Customer customerName:customers){
            if(customerName.getID() == customer_ID){
                flag =true;
            }
        }
        return flag;
    }
    public String displayAccount(Customer customer) {
        Integer customerID = customer.getID();
        boolean flag = searchID(customerID);
        if(flag) {
            return "Customer ID:" + " " + customer.getID() + "\n" + "Customer username:" + " " + customer.getUsername() + "\n" + "Customer email:" + " " + customer.getEmail();
            
        }
        else {
            return "Customer doesnt exists";
        }
    }
    public void addCat(Product product){

        category.add(product.getCategory());

    }


    public boolean deleteCat(String string) {
        boolean flag = false;
        Iterator<String> iterator = category.iterator();
        while (iterator.hasNext()) {
            String currentCategory = iterator.next();
            if (currentCategory.equals(string)) {
                iterator.remove();
                System.out.println("Category '" + string + "' is deleted");
                flag = true;
                break;  // Exit the loop after deleting the category
            }
        }

        if (!flag) {
            logger.info("No category found");
        }

        return flag;
    }

        public void updateProductDetails(Product product_old, Integer newPrice, String newImage,Integer avail) {
            if (product.contains(product_old)) {
                if (product_old.checkImage(newImage)) {
                    product_old.setImage(newImage);
                }
                else {
        logger.info("Wrong type of image");
                }

                if (product_old.checkPrice(newPrice)) {
                    product_old.setPrice(newPrice);
                }
                else {
                    logger.info("Wrong type of price");

                }


                if (product_old.checkAvail(avail)) {
                    product_old.setAvailability(avail);
                }
                else {
                    logger.info("Wrong type of availability");

                }

             logger.info("Product details updated by admin");
            } else {
                logger.info("Product not found. Update failed.");
            }
        }


   public void scheduleAppointment(Appointment  appointment,Customer customer) {

        customer.app.add(appointment);


    }


    public void cancelApp(int appointmentID,Customer customer) {
        for(Appointment appointment:customer.getApp()){

            if(appointment.getID() == appointmentID){

                appointment.setIsCanceled(true);
                logger.info("Appointment is canceled");


            }
            else{
                logger.info("Product doesn't exist.. cant cancel this appointement  ");
            }

        }
    }
}





