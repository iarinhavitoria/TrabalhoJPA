/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;

/**
 *
 * @author Iara
 */


@Entity
public class GerenciadorEntidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GerenciadorEntidade)) {
            return false;
        }
        GerenciadorEntidade other = (GerenciadorEntidade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataAccess.NewEntity[ id=" + id + " ]";
    }
    
    
public static void main(String[] args) {
        // TODO code application logic here
     // Gerenciador de entidades
    EntityManager manager;

// Criador de Gerenciador de entidades
    EntityManagerFactory factory;
    
    factory = Persistence.createEntityManagerFactory("TrabPratico1PU");
    manager = factory.createEntityManager();
    }
    
}
