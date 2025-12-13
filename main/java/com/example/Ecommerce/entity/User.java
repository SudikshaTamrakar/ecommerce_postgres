package com.example.Ecommerce.entity;

import com.example.Ecommerce.enums.Logontype;
import jakarta.persistence.*;

import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userTable")
@Builder
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "user_id")
    @SequenceGenerator(name = "userid",sequenceName = "userid",allocationSize = 1)
    private Integer id;
    @Column(name="full_name")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name="address")
    private String address;
    @Column(name = "username",length = 100)
    private String userName;
    @Column(name = "password",length = 100)
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Logontype logonType;


    public User(String fullName,
                String userName,
                String email,
                String mobileNumber,
                String address,
                String password,
                Logontype logonType

    )
    {
        this.fullName=fullName;
        this.email=email;
        this.address=address;
        this.mobileNumber=mobileNumber;
        this.logonType=logonType;
        this.userName=userName;
        this.password=password;
    }


}
