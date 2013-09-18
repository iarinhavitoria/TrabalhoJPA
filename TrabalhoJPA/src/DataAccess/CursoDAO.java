/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Curso;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class CursoDAO extends GenericoDAO<Curso>{
    public CursoDAO(){
        super(Curso.class);
    }
    
    public List<Curso> buscar(Curso filtro){
        
        Query consulta = null;
             
        if(filtro.getNome().length() > 0){
            consulta = manager.createQuery("select cr from Curso cr where nome = :p0");
            consulta.setParameter("p0", filtro.getNome());
        }
        
        if(filtro.getIdCurso() > 0){
            consulta = manager.createQuery("select cr from Curso cr where idcurso = :p1");
            consulta.setParameter("p1", filtro.getIdCurso());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Curso> listarTodos(){
        
        Query consulta = manager.createQuery("select cr from Curso cr");
        
        return consulta.getResultList();
        
    }
}
