package le.crm.crm.repository;

import le.crm.crm.entity.Customer;
import le.crm.crm.entity.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * ClassName: CustomerRepository
 * Package: le.crm.crm.repository
 * Description:
 *
 * @Author Ruler
 * @Create 2025/6/1 0:56
 * @Version 1.0
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByStatus(CustomerStatus status);
    Optional<Customer> findByCustomerNumber(String customerNumber);
}