/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 
 */
package DataAccess;

import DomainModel.Administrador;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class AdministradorDAO extends GenericoDAO<Administrador>{
    public AdministradorDAO(){
        super(Administrador.class);
    }
    
    public List<Administrador> buscarAdministrador(Administrador filtro){
        
        Query consulta = null;
             
        if(filtro.getUsuario().length() > 0){
            consulta = manager.createQuery("select a from Administrador a where usuario = :p0");
            consulta.setParameter("p0", filtro.getUsuario());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Administrador> listarTodos(){
        
        Query consulta = manager.createQuery("select a from Administrador a");
        
        return consulta.getResultList();
        
    }
}
