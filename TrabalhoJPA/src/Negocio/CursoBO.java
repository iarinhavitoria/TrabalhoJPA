/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.CursoDAO;
import DomainModel.Curso;
import java.util.List;

/**
 *
 * @author Iara
 */
public class CursoBO {
    CursoDAO cursoDAO = new CursoDAO();
    
    public boolean Salvar(Curso obj){
        //Validacao do nome (igual a zero)
        if (obj.getNome().trim().length() == 0 ){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        // Validacao por tamanho de variavel no banco de dados
        if (obj.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        //
        /*Curso cursoobt = cursoDAO.buscar(obj);*/
        
        //Se tudo estiver ok, passa para DataAccess
        cursoDAO.Salvar(obj);
        return true;
    }
    
    public Curso Abrir(int codigo){
        return cursoDAO.Abrir(codigo);
    }
    public boolean Apagar(Curso curso){
        return cursoDAO.Apagar(curso);
    }
    
    public List<Curso> listarTodos(){
        return cursoDAO.listarTodos();
    }
    
    public List<Curso> buscar(Curso filtro){
        return cursoDAO.buscar(filtro);
    }  
}
