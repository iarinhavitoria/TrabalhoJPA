/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.QuartoDAO;
import DomainModel.Quarto;
import java.util.List;

/**
 *
 * @author Iara
 */
public class QuartoBO {
    private QuartoDAO quartoDAO = new QuartoDAO();
    
    public boolean Salvar(Quarto quarto){
        if(quarto.getNumero() == 0){
            throw new RuntimeException("O numero nao pode ser igual a 0!");
        }
        if(quarto.getCodpredio() == 0){
            throw new RuntimeException("Codigo do predio Invalido!");
        }
        quartoDAO.Salvar(quarto);
        return true;
    }
    public Quarto Abrir(int codigo){
        return quartoDAO.Abrir(codigo);
    }
    public void Apagar(Quarto quarto){
        quartoDAO.Apagar(quarto);
    }
    public List<Quarto> listarTodos(){
        return quartoDAO.listarTodos();
    }
    
    public List<Quarto> buscar(Quarto filtro){
        return quartoDAO.buscar(filtro);
    }
    public List<Quarto> listarOrdenado(){
        return quartoDAO.listarOrdenado();
    }
}

