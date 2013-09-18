/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Quarto;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 * 
 * 
 */
public class QuartoDAO extends GenericoDAO<Quarto>{
    public QuartoDAO(){
        super(Quarto.class);
    }
    
    public List<Quarto> buscar(Quarto filtro){
        
        Query consulta = null;
             
        if(filtro.getNumero() > 0){
            consulta = manager.createQuery("select q from Quarto q where numero = :p0");
            consulta.setParameter("p0", filtro.getNumero());
        }
        
        if(filtro.getIdQuarto() > 0){
            consulta = manager.createQuery("select q from Quarto q where idquarto = :p1");
            consulta.setParameter("p1", filtro.getIdQuarto());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Quarto> listarTodos(){
        
        Query consulta = manager.createQuery("select q from Quarto q");
        
        return consulta.getResultList();
        
    }
}
