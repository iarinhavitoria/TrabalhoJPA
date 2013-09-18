/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package DataAccess;

import DomainModel.Predio;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class PredioDAO extends GenericoDAO<Predio>{
    public PredioDAO(){
        super(Predio.class);
    }
    
    public List<Predio> buscar(Predio filtro){
        
        Query consulta = null;
             
        if(filtro.getNome().length() > 0){
            consulta = manager.createQuery("select p from Predio p where nome = :p0");
            consulta.setParameter("p0", filtro.getNome());
        }
        
        if(filtro.getIdPredio() > 0){
            consulta = manager.createQuery("select p from Predio p where idpredio = :p1");
            consulta.setParameter("p1", filtro.getIdPredio());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Predio> listarTodos(){
        
        Query consulta = manager.createQuery("select p from Predio p");
        
        return consulta.getResultList();
        
    }
}
