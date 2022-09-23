package corejava.collection.assignment02.Assignment2.parser;
import corejava.collection.assignment02.Assignment2.mapper.mapCustomer;
import corejava.collection.assignment02.Assignment2.model.Customer;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.BufferedReader;
public class CustomerParser {

    public List<Customer> parseArray(String[] inputData) {
        List<Customer> list = new ArrayList<Customer>();
        for (String data : inputData) {
            Customer customer = mapCustomer.map(data);
            list.add(customer);
        }
        return list;
    }

    public List<Customer> parseCSvFile(String filePath) {
        List<Customer> list = new ArrayList<Customer>();
        File file = new File(filePath);
        BufferedReader br=null;
        try  {
            br = new BufferedReader(new FileReader(file));
            String stf;

            while ((stf = br.readLine()) != null) {
                Customer customer = mapCustomer.map(stf);
                if (customer != null) {
                    list.add(customer);
                    //System.out.println(stf);
                }
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } catch (Exception exe) {
            throw new RuntimeException(exe);
        } finally {
           try {
               br.close();
           } catch (IOException e) {
              throw new RuntimeException(e);
           }
       }
        return list;
    }
}


