/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Funcionario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */

public class FuncionarioDAO extends GenericoDAO<Funcionario>{
    
    public FuncionarioDAO(){
        super(Funcionario.class);
    }
    
    public List<Funcionario> buscarFuncionario(Funcionario filtro){
        
        Query consulta = null;
             
        if(filtro.getNome().length() > 0){
            consulta = manager.createQuery("select f from Funcionario f where nome = :p0");
            consulta.setParameter("p0", filtro.getNome());
        }
        
        if(filtro.getCpf().length() > 0){
            consulta = manager.createQuery("select f from Funcionario f where cpf = :p1");
            consulta.setParameter("p1", filtro.getCpf());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Funcionario> listarTodos(){
        
        Query consulta = manager.createQuery("select f from Funcionario f");
        
        return consulta.getResultList();
        
    }
}
