/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * create table administrador(
idadministrador int not null primary key,
usuario varchar(20),
senha varchar(18))
 */
package DomainModel;

import java.io.Serializable;
import java.util.Objects;
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
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAdministrador;
    
    @Column(name="Usuario",length=20)
    private String usuario;
    
    @Column(name="Senha",length=18)
    private String senha;
    
    public Administrador(){
        usuario = "";
        senha = "";
    }

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idAdministrador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
        if (!Objects.equals(this.idAdministrador, other.idAdministrador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + '}';
    }
    
    
    
    
    
}
