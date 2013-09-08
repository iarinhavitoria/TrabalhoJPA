/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Iara
 */
@Entity
public class Email implements Serializable {
    @Column (name="Email")
    private String email;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    
    public Email(){
        this.email = "teste@ol.com.br";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
}
