package DataAccess;

import DomainModel.Material;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Iara
 */
public class MaterialDAO extends GenericoDAO<Material>{
    public MaterialDAO(){
        super(Material.class);
    }
    
    public List<Material> buscar(Material filtro){
        
        Query consulta = null;
             
        if(filtro.getDescricao().length() > 0){
            consulta = manager.createQuery("select m from Material m where descricao = :p0");
            consulta.setParameter("p0", filtro.getDescricao());
        }
        
        if(filtro.getIdMaterial() > 0){
            consulta = manager.createQuery("select m from Material m where idmaterial = :p1");
            consulta.setParameter("p1", filtro.getIdMaterial());
        }
        
        return consulta.getResultList();
        
    }
    
    public List<Material> listarTodos(){
        
        Query consulta = manager.createQuery("select m from Material m");
        
        return consulta.getResultList();
        
    }
}
