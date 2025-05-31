package le.crm.crm.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * ClassName: CustomerLoss
 * Package: le.crm.crm.entity
 * Description:
 *
 * @Author Ruler
 * @Create 2025/6/1 0:40
 * @Version 1.0
 */
@Entity
@Table(name = "customer_loss")
public class CustomerLoss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private LocalDate lastOrderDate;
    private LocalDate confirmedLossDate;

    @Enumerated(EnumType.STRING)
    private LossStatus status; // 枚举：暂缓流失/确认流失

    private String reason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getLastOrderDate() {
        return lastOrderDate;
    }

    public void setLastOrderDate(LocalDate lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public LocalDate getConfirmedLossDate() {
        return confirmedLossDate;
    }

    public void setConfirmedLossDate(LocalDate confirmedLossDate) {
        this.confirmedLossDate = confirmedLossDate;
    }

    public LossStatus getStatus() {
        return status;
    }

    public void setStatus(LossStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}


