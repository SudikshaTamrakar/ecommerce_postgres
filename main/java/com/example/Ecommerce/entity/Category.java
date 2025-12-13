package com.example.Ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categoryTable")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "category_id")
    @SequenceGenerator(name = "category_id", sequenceName = "category_id",allocationSize = 1)
    private String id;
    @Column(name = "category_name")
    private String categoryName;
    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id",foreignKey = @ForeignKey(name ="fk_product_category" ))
    private Product product;



}
