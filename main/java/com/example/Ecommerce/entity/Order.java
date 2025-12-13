package com.example.Ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="orderTable")
@Builder
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id")
    @SequenceGenerator(name = "order_id",sequenceName = "order_id",allocationSize = 1)
    private String id;
    @Column(name = "order_date")
    private DateTimeAtCreation orderDate;
    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id",foreignKey = @ForeignKey(name ="fk_ordered_product_id"))
    private Product product;



}
