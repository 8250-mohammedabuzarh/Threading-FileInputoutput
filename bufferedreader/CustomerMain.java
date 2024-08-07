package bufferedreader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerMain {

    private List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        String inputfile = "C:\\Users\\shaik.mohammed02\\Downloads\\transactions.txt";
        String outputfile = "C:\\Users\\shaik.mohammed02\\Downloads\\filtered_transactions.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputfile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String customerid = data[0].trim();
                String transactionid = data[1].trim();
                String transactiondate = data[2].trim();
                double transactionamount = Double.parseDouble(data[3].trim());
                Customer customer = new Customer(customerid, transactionid, transactiondate, transactionamount);
                if (customer.getTransactionamount() < 15000) {
                    System.out.println(customer);
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputfile, true))) {
                        writer.write(customer.toString());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

