/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Iara
 */
public class AlunoTarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idalunotarefa;
    @Column(nullable=false)
    private int idaluno;
    private int idtarefa;

    public int getIdalunotarefa() {
        return idalunotarefa;
    }

    public void setIdalunotarefa(int idalunotarefa) {
        this.idalunotarefa = idalunotarefa;
    }

    public int getIdaluno() {
        return idaluno;
    }

    public void setIdaluno(int idaluno) {
        this.idaluno = idaluno;
    }

    public int getIdtarefa() {
        return idtarefa;
    }

    public void setIdtarefa(int idtarefa) {
        this.idtarefa = idtarefa;
    }

    
    
    
    
    
    
    
    
}
