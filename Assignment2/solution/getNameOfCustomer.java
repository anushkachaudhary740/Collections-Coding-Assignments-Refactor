package corejava.collection.assignment02.Assignment2.solution;
import corejava.collection.assignment02.Assignment2.model.Customer;


import java.util.*;

public class getNameOfCustomer {
    private List<Customer> customerArrayList;

    public  getNameOfCustomer(List<Customer> studentArrayList ) {

        this.customerArrayList=studentArrayList;
    }

    public  Set findProductName() {
        Set<String> st = new HashSet<>();
        Iterator<Customer> it = customerArrayList.iterator();
        while (it.hasNext()) {
            Customer cst = it.next();
            st.add(cst.getProductName());
        }
        return st;
    }
    public void customerName(Set st){
        for (Object nameOfProduct : st) {
            Iterator<Customer> it1 = customerArrayList.iterator();

            List<Integer> price = new ArrayList<Integer>();

            Integer temp = 0;
            while (it1.hasNext()) {
                Customer values = it1.next();
                String productNameInList = values.getProductName();

                if (nameOfProduct.equals(productNameInList)) {
                    Integer productPrice = values.getPrice();
                    temp++;
                    price.add(productPrice);
                }
            }
            Integer discountPrice = price.stream().min(Integer::compare).get();

            Iterator<Customer> it12 = customerArrayList.iterator();
            while (it12.hasNext()) {
                Customer values = it12.next();
                Integer getPriceFromList = values.getPrice();

                if (discountPrice == getPriceFromList && temp != 1) {
                    String name = values.getCustomerName();
                    System.out.println(name);
                }
            }
        }
    }


}


