/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iara
 */
public class CursoDAO {
    private BancodeDados bd;

    public CursoDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Curso obj) {
        try{
            if (obj.getIdCurso() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into cursos(nome) values(?)");
                comando.setString(1, obj.getNome());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update cursos set nome = ? where idcurso = ?");
                comando.setString(1, obj.getNome());
                comando.setLong(2, obj.getIdCurso());
                comando.executeUpdate();
            }
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Curso Abrir(int codigo) {
        try {
            Curso curso = new Curso ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from cursos where idcurso = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            curso.setIdCurso(resultado.getLong("idcurso"));
            curso.setNome(resultado.getString("nome"));
            
            return curso;
            
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException();
        }
    }

    public boolean Apagar(Curso obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from cursos where idcurso = ?");
            comando.setLong(1, obj.getIdCurso());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Curso> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from cursos");
            ResultSet resultado = comando.executeQuery();
            
            List<Curso> curso = new LinkedList<>();
            while (resultado.next()) {
                Curso tmp = new Curso();
                
                tmp.setIdCurso(resultado.getLong("idcurso"));
                tmp.setNome(resultado.getString("nome"));
                
                curso.add(tmp);
            }
            return curso;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Curso> buscar(Curso filtro) {
        try {
            
            String sql = "select * from cursos ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getIdCurso() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idcurso = " + filtro.getIdCurso();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Curso> curso = new LinkedList<>();
            while (resultado.next()) {
                
                Curso temp = new Curso();
                
                temp.setIdCurso(resultado.getLong("idcurso"));
                temp.setNome(resultado.getString("nome"));                
                
                curso.add(temp);
            }
            return curso;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
/*    public Curso buscarNome(String nome) {
        try {
            
            String sql = "select * from curso ";
            String where = "";
            
            
            where = "nome like "+nome;
            
            
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
           
            
            return resultado.;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }*/
}
