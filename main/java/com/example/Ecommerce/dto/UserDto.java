package com.example.Ecommerce.dto;

import com.example.Ecommerce.enums.LogonType
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Integer id;
   @NotEmpty(message="You must enter name")
   @Size(min=3,max=100,message="Your name must be between 3-100 characters")
    private String fullName;
    private String email;
    private String address;
    private String mobileNumber;
    private String userName;
    private String password;
    private LogonType logonType;


}
