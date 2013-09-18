/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Campus;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class CampusDAO extends GenericoDAO<Campus>{
    public CampusDAO(){
        super(Campus.class);
    }
    
    public List<Campus> buscar(Campus filtro){
        
        Query consulta = null;
             
        if(filtro.getNome().length() > 0){
            consulta = manager.createQuery("select c from Campus c where nome = :p0");
            consulta.setParameter("p0", filtro.getNome());
        }
        
        if(filtro.getIdCampus() > 0){
            consulta = manager.createQuery("select c from Campus c where idcampus = :p1");
            consulta.setParameter("p1", filtro.getIdCampus());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Campus> listarTodos(){
        
        Query consulta = manager.createQuery("select c from Campus c");
        
        return consulta.getResultList();
        
    }
}
