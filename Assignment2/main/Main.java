package corejava.collection.assignment02.Assignment2.main;
import corejava.collection.assignment02.Assignment2.model.Customer;
import corejava.collection.assignment02.Assignment2.solution.getNameOfCustomer;
import corejava.collection.assignment02.Assignment2.parser.CustomerParser;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {

//        String input[] = {
//                "Rajan Patil, Aundh,1, Phone Cover,170, Cash",
//                "Mohit Gupta, Baner,1, Samsung Battery,900, Credit Card",
//                "Rajan Patil, Aundh,3, Samsung Battery,1000, Cash",
//                "Nina Kothari, Baner,4, Earphones,500, Credit Card",
//                "T Sunitha, Shivajinagar,5, Earphones,550, Credit Card",
//                "Rohan Gade, Aundh,10, Motorola Battery,1000, Credit Card",
//                "Rajan Patil, Shivajinagar,21, Earphones,550, Credit Card",
//                "Rajan Patil, Aundh,22, USB Cable,150, UPI",
//                "Meena Kothari, Baner,23, USB Cable,100, Cash",
//                "Nina Kothari, Baner,24, USB Cable,200, UP"
//        };
            CustomerParser inputParser = new CustomerParser();
            //studentMap inputPasser =new studentMap();
//        List<Customer> studentArrayList=inputParser.parseArray(input);
//
//        getNameOfCustomer op = new getNameOfCustomer();
//
//
//        op.getInput(input);
//        Set name=op.findProductName();
//        op.customerName(name);

            // For using CSV file
            String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment2/inputfile/fileinput.csv";
            List<Customer> customerArrayList = inputParser.parseCSvFile(filePath);

            getNameOfCustomer om = new getNameOfCustomer(customerArrayList);
            Set name = om.findProductName();
            om.customerName(name);
        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
