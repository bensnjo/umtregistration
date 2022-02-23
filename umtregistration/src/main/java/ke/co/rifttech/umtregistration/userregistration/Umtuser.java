package ke.co.rifttech.umtregistration.userregistration;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Umtuser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private int idNumber;
    private String imageUrl;


}
