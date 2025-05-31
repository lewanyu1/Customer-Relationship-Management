package le.crm.crm.repository;

import le.crm.crm.entity.Customer;
import le.crm.crm.entity.CustomerLoss;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ClassName: CustomerLossRepository
 * Package: le.crm.crm.repository
 * Description:
 *
 * @Author Ruler
 * @Create 2025/6/1 0:57
 * @Version 1.0
 */
public interface CustomerLossRepository extends JpaRepository<CustomerLoss, Long> {
    List<CustomerLoss> findByCustomer(Customer customer);
}