package corejava.collection.assignment02.Assignment2.mapper;

import corejava.collection.assignment02.Assignment2.model.Customer;

public class mapCustomer {
    public static Customer map(String data) {

        String[] splitArray = data.split(",");
        try {
            Integer date = Integer.parseInt(splitArray[2]);
            Integer price = Integer.parseInt(splitArray[4]);
            String productName = splitArray[3];
            String customerName = splitArray[0];
            String location = splitArray[1];
            String paymentType = splitArray[5];
            Customer customer = new Customer(customerName, location, date, productName, price, paymentType);

            return customer;
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
