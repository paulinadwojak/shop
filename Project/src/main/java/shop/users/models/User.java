package shop.users.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import shop.users.UserRole;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name="user_name")
    private String name;

    @Column(name="user_surname")
    private String surname;

    @Column(name="email")
    @NotEmpty(message = "*Please provide your email")
    private String email;

    @Column(name="password")
    @Length(min = 3, message = "*Your password must have at least 3 characters")
    @NotEmpty(message = "*Please provide your password")
    private String password;

    @Column(name = "user_role")
    private UserRole userRole;


}
