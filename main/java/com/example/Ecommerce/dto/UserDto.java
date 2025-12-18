package com.example.Ecommerce.dto;

import com.example.Ecommerce.enums.LogonType
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
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
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid Email !! please type a valid email.")
   @NotEmpty(message = "Email cannot be empty")
   private String email;
    @NotEmpty(message = "Address field can not be Empty")
    @Size(min = 5, max = 100, message = "Address field should be between 5-100 characters")
    private String address;
    @NotEmpty(message = "Mobile number  can not be Empty")
    @Pattern(regexp = "^\\+?(?:977)?[ -]?(?:(?:(?:98|97)-?\\d{8})|(?:01-?\\d{7}))$",message = "Invalid Mobile Number ,Please Enter Valid Number ")
    @Size(min = 10,max = 10,message = "Mobile Number should be Exactly of 10 Digit")
    private String mobileNumber;
    @NotEmpty(message = "UserName cannot be empty")
    private String userName;
    @NotEmpty(message = "password cannot be empty")
    private String password;
    private LogonType logonType;


}
