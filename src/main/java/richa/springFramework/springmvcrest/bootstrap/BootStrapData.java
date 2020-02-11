package richa.springFramework.springmvcrest.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import richa.springFramework.springmvcrest.model.Customer;
import richa.springFramework.springmvcrest.repository.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer data: ");

        Customer c1= new Customer();
        c1.setFirstName("richa");
        c1.setLastName("Patel");
        customerRepository.save(c1);

        Customer c2= new Customer();
        c2.setFirstName("Dhruvesh");
        c2.setLastName("Patel");
        customerRepository.save(c2);

        Customer c3= new Customer();
        c3.setFirstName("Vivek");
        c3.setLastName("Patel");
        customerRepository.save(c3);

        System.out.println("Customer Saved: " + customerRepository.count());
    }
}
