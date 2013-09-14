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
public class Material implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idMaterial;
    @Column(name="Descricao",length=200,nullable=false)
    private String descricao = "";
    
    
    public Material(int codigo, String desc){
        this.idMaterial = 0;
        this.descricao = "";
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
