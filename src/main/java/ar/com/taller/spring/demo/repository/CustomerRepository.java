package ar.com.taller.spring.demo.repository;


import ar.com.taller.spring.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//Acceeso a datos
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
