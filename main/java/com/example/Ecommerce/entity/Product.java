package com.example.Ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productTable")
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_id")
    @SequenceGenerator(name = "product_id",sequenceName = "product_id",allocationSize = 1)
    private String id;
    private String product_name;
    private String product_price;
    private String product_quantity;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_product_user_id"))
    private User user;
}
