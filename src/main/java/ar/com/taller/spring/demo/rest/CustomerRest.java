package ar.com.taller.spring.demo.rest;

import ar.com.taller.spring.demo.model.Customer;
import ar.com.taller.spring.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerRest {

        @Autowired
        private CustomerRepository customerRepository;

        @RequestMapping (method = RequestMethod.GET)
        public Iterable<Customer> getAll(){
            return customerRepository.findAll();
        }

    @RequestMapping (method = RequestMethod.POST)
    public @ResponseBody Customer insert(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }


}
