package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logic {

    public List<Customer> getList() {
        return list;
    }

    private List<Customer> list;

    public Logic() {
        list = new ArrayList<>();
    }

    public boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[?!,.]+[a-zA-Z]+$");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public void insertInList() {
        Customer tempCustomer = new Customer();
        tempCustomer.setId(1);
        for (var customer : list) {
            if (customer.getId() >= tempCustomer.getId())
                tempCustomer.setId(customer.getId() + 1);
        }
        list.add(tempCustomer);
    }

    public boolean deleteFromList(Customer model) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).getId() == model.getId()) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

}
