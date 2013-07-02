/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DataAccess.AlocacaoDAO;
import DomainModel.Alocacao;
import DomainModel.Aluno;
import DomainModel.Quarto;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Iara
 * * 
dataentrada date datasaida date
 */
public class AlocacaoBO {

    private AlocacaoDAO alocacaoDAO = new AlocacaoDAO();

    public void Salvar() {
//        if(alocacao.getIdaluno() == 0){
//            throw new RuntimeException("O Codigo do Aluno nao pode ser igual a 0!");
//        }
//        if(alocacao.getIdquarto() == 0){
//            throw new RuntimeException("O Codigo do Quarto nao pode ser igual a 0!");
//        }
//        if(alocacao.getSemestreletivo().trim().length() == 0){
//            throw new RuntimeException("O semestre letivo nao pode ser vazio!");
//        }
//        if (alocacao.getSemestreletivo().length() > 20){
//            throw new RuntimeException("O semestre letivo esta além do tamanho permitido!");
//        }
//        alocacaoDAO.Salvar(alocacao);

        AlunoBO bo = new AlunoBO();
        QuartoBO qbo = new QuartoBO();

        List<Aluno> alunos = bo.listarOrdenado();
        List<Quarto> quartos = qbo.listarOrdenado();
        List<Alocacao> alocar = new LinkedList();

        int qtd = quartos.size() * 16;
        if (alunos.size() > qtd) {
            throw new RuntimeException("Não há vagas o suficiente.");
        }

        if (alunos.isEmpty()) {
            throw new RuntimeException("Não há alunos cadastrados.");
        }
        if (quartos.isEmpty()) {
            throw new RuntimeException("Não há quartos cadastrados.");
        }
        
        //Gera a lista de alocação
        int nu = 0;
        for (int z = 0; z < quartos.size(); z++) {
            Quarto q = quartos.get(z);
            int y = 0;
            while(y < 16){
            //for (int y = 0; (nu < (alunos.size()) || (y == 15)); y++) {
                if(nu < alunos.size()){
                    Aluno a = alunos.get(nu);

                    Alocacao alocacao = new Alocacao();

                    alocacao.setIdaluno(a.getIdAluno());
                    alocacao.setIdquarto(q.getIdQuarto());
                    alocacao.setDataEntrada(new Date());

                    Date dt = new Date();
                    dt.setYear(dt.getYear() + 1);
                    alocacao.setDataSaida(dt);

                    alocar.add(alocacao);
                    //alunos.remove(a);
                    nu++;
                }
                y++;
            }
            }
        
        alocacaoDAO.ApagarTudo();
        for (int u = 0; u < alocar.size(); u++) {
            Alocacao al = alocar.get(u);
            alocacaoDAO.Salvar(al);
        }


    }

    public Alocacao Abrir(int codigo) {
        return alocacaoDAO.Abrir(codigo);
    }

    public void Apagar(Alocacao alocacao) {
        alocacaoDAO.Apagar(alocacao);
    }

    public void ApagarTudo() {
        alocacaoDAO.ApagarTudo();
    }
}
