/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.TarefasSemanais;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class TarefaSemanaisDAO extends GenericoDAO<TarefasSemanais>{
    public TarefaSemanaisDAO(){
        super(TarefasSemanais.class);
    }
    
    public List<TarefasSemanais> buscar(TarefasSemanais filtro){
        
        Query consulta = null;
             
        if(filtro.getDescricao().length() > 0){
            consulta = manager.createQuery("select ts from TarefasSemanais ts where descricao = :p0");
            consulta.setParameter("p0", filtro.getDescricao());
        }
        
        if(filtro.getIdTarefas() > 0){
            consulta = manager.createQuery("select ts from TarefasSemanais ts where idmaterial = :p1");
            consulta.setParameter("p1", filtro.getIdTarefas());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<TarefasSemanais> listarTodos(){
        
        Query consulta = manager.createQuery("select ts from TarefasSemanais ts");
        
        return consulta.getResultList();
        
    }
}
