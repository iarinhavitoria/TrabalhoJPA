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
import javax.persistence.ManyToOne;

/**
 *
 * @author Iara
 */
@Entity
public class Predio implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idPredio;
    @Column(name="Nome",length=200)
    private String nome;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private Campus campus;

    
    
    public Predio(int id, String nome){
        this.idPredio = id;
        this.nome = nome;
    }

    public int getIdPredio() {
        return idPredio;
    }

    public void setIdPredio(int idPredio) {
        this.idPredio = idPredio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
    
    
}
