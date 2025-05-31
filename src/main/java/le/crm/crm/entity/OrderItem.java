package le.crm.crm.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

/**
 * ClassName: OrderItem
 * Package: le.crm.crm.entity
 * Description:
 *
 * @Author Ruler
 * @Create 2025/6/1 0:56
 * @Version 1.0
 */
@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private CustomerOrderHistory order;

    private String productName;
    private Integer quantity;
    private String unit;
    private BigDecimal price;
    private BigDecimal total;

    // Getters and Setters
}