/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package DataAccess;

import DomainModel.Aluno;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class AlunoDAO extends GenericoDAO<Aluno>{
    public AlunoDAO(){
        super(Aluno.class);
    }
    
    public List<Aluno> buscar(Aluno filtro){
        
        Query consulta = null;
             
        if(filtro.getNome().length() > 0){
            consulta = manager.createQuery("select al from Aluno al where nome = :p0");
            consulta.setParameter("p0", filtro.getNome());
        }
        
        if(filtro.getIdAluno() > 0){
            consulta = manager.createQuery("select al from Aluno al where idaluno = :p1");
            consulta.setParameter("p1", filtro.getIdAluno());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Aluno> listarTodos(){
        
        Query consulta = manager.createQuery("select al from Aluno al");
        
        return consulta.getResultList();
        
    }
    
}
