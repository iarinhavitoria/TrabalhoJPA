/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AlunoDAO;
import DataAccess.CursoDAO;
import DomainModel.Aluno;
import DomainModel.Curso;
import java.util.List;

/**
 *
 * @author Iara
 */
public class AlunoBO {
    private AlunoDAO alunoDAO = new AlunoDAO();
    
    public boolean Salvar(Aluno aluno){
        if(aluno.getNome().trim().length() == 0){
            throw new RuntimeException("O nome nao pode ser vazio!");
        }
        if (aluno.getNome().length() > 50){
            throw new RuntimeException("O nome esta além do tamanho permitido!");
        }
        if(aluno.getCpf().trim().length() == 0){
            throw new RuntimeException("O CPF nao pode ser vazio!");
        }
        if (aluno.getCpf().length() > 14){
            throw new RuntimeException("O CPF esta além do tamanho permitido!");
        }
        if(aluno.getRg().trim().length() == 0){
            throw new RuntimeException("O RG nao pode ser vazio!");
        }
        if (aluno.getRg().length() > 14){
            throw new RuntimeException("O RG esta além do tamanho permitido!");
        }
        if(aluno.getTelefone().trim().length() == 0){
            throw new RuntimeException("O Telefone nao pode ser vazio!");
        }
        if (aluno.getTelefone().length() > 14){
            throw new RuntimeException("O Telefone esta além do tamanho permitido!");
        }
        if(aluno.getEmail().trim().length() == 0){
            throw new RuntimeException("O Email nao pode ser vazio!");
        }
        if (aluno.getEmail().length() > 30){
            throw new RuntimeException("O Email esta além do tamanho permitido!");
        }
        if(aluno.getNomeresp().trim().length() == 0){
            throw new RuntimeException("O nome do responsavel nao pode ser vazio!");
        }
        if (aluno.getNomeresp().length() > 40){
            throw new RuntimeException("O nome do responsavel esta além do tamanho permitido!");
        }
        if(aluno.getTelefoneresp().trim().length() == 0){
            throw new RuntimeException("O CPF nao pode ser vazio!");
        }
        if (aluno.getTelefoneresp().length() > 14){
            throw new RuntimeException("O CPF esta além do tamanho permitido!");
        }
        if(aluno.getIdcurso() == 0){
            throw new RuntimeException("O Codigo do Curso nao pode ser 0!");
        }
        
        try{
            CursoDAO cdao = new CursoDAO();
            cdao.Abrir(aluno.getIdcurso());
        } catch(Exception ex){
            throw new RuntimeException("Não existe curso referente ao ID informado!");
        }
        
        alunoDAO.Salvar(aluno);
        return true;
    }
    public Aluno Abrir(int codigo){
        return alunoDAO.Abrir(codigo);
    }
    public boolean Apagar(Aluno aluno){
        return alunoDAO.Apagar(aluno);
    }
    public List<Aluno> listarTodos(){
        return alunoDAO.listarTodos();
    }
    
    public List<Aluno> buscar(Aluno filtro){
        return alunoDAO.buscar(filtro);
    }
    public List<Aluno> listarOrdenado(){
        return alunoDAO.listarOrdenado();
    }
}
