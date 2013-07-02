/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AlunoTarefaDAO;
import DomainModel.Aluno;
import DomainModel.AlunoTarefa;
import DomainModel.TarefasSemanais;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * idaluno int
idtarefa int
 * @author Iara
 */
public class AlunoTarefaBO {
    private AlunoTarefaDAO alunotarefaDAO = new AlunoTarefaDAO();
    
    public void Salvar(){
        
        AlunoBO bo = new AlunoBO();
        TarefaSemanaisBO tbo = new TarefaSemanaisBO();
        
        List<Aluno> alunos = bo.listarOrdenado();
        List<TarefasSemanais> tarefas = tbo.listarTodos();
        List<AlunoTarefa> alunotarefa = new LinkedList();
        
        if(alunos.isEmpty()){
            throw new RuntimeException("Não há alunos cadastrados.");
        }
        if(tarefas.isEmpty()){
            throw new RuntimeException("Não há tarefas cadastradas.");
        }
        
        //Gera a lista de alocação
        for(TarefasSemanais ts : tarefas){
            for (Aluno a : alunos){
                alunotarefaDAO.ApagarTudo();
                AlunoTarefa at = new AlunoTarefa();
                
                at.setIdaluno(a.getIdAluno());
                at.setIdtarefa(ts.getIdTarefas());
                
                alunotarefa.add(at);
                alunos.remove(a);
            }
           
        }
        
        for (AlunoTarefa at: alunotarefa){
            alunotarefaDAO.Salvar(at);
        }
        
        
        
    }
    public AlunoTarefa Abrir(int codigo){
        return alunotarefaDAO.Abrir(codigo);
    }
    public void Apagar(AlunoTarefa alunotarefa){
        alunotarefaDAO.Apagar(alunotarefa);
    }
    
}
