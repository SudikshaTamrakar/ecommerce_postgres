package com.example.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "paymentTable")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payment_id")
    @SequenceGenerator(name = "payment_id", sequenceName = "payment_id", allocationSize = 1)
    private String id;
    @Column(name = "payment_mode")
    private String paymentMode;
    @Column(name = "payed_amount")
    private Integer payedAmount;
    @Column(name = "payed_date")
    private Integer payedDate;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_payment_user_id"))
    private User user;



}
