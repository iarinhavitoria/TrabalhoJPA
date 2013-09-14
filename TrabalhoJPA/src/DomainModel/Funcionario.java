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
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idFuncionario;
    @Column(name="Nome",length=200,nullable=false)
    private String nome;
    @Column(name="CPF",length=14,nullable=false)
    private String cpf;
    @Column(name="Telefone",length=12,nullable=false)
    private String telefone;
    
    public Funcionario(int id, String nome, String cpf, String tel){
        this.idFuncionario = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = tel;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
}
