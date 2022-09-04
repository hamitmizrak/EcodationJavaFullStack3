package com.hamitmizrak.data.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Entity
@Entity
@Table(name="register")
public class RegisterEntity extends BaseEntity  implements Serializable {
    public static final Long serialVersionUID =1L;

    private String name;
    @Column(name="email",nullable = false,unique = false)
    private String email;

    private String password;
}
