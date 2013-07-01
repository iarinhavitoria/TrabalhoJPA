/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import DomainModel.MaterialQuarto;
import DomainModel.Quarto;
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
 * 
 * 
 */
public class QuartoDAO {
    private BancodeDados bd;

    public QuartoDAO() {
        bd = new BancodeDados();
    }

    public boolean Salvar(Quarto obj) {
        try {
            if (obj.getIdQuarto() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into quartos(numero, banheiro, idpredio) values(?,?,?)");
                comando.setInt(1, obj.getNumero());
                comando.setBoolean(2, true);
                comando.setInt(3, obj.getCodpredio());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update quartos set numero=?,banheiro=?,idpredio=? where idquarto = ?");
                comando.setInt(1, obj.getNumero());
                comando.setBoolean(2, true);
                comando.setInt(3, obj.getCodpredio());
                comando.executeUpdate();
            }

            for (MaterialQuarto mq : obj.getMats()) {
                if (mq.isAtivo()) {
                    if (mq.getIdMaterialQuarto() == 0) {
                        PreparedStatement comando = bd.getConexao().prepareStatement("insert into materialporquarto(idmaterial, idquarto, qtde) values(?,?,?)");
                        comando.setInt(1, obj.getIdQuarto());
                        comando.setInt(2, mq.getMaterial().getIdMaterial());
                        comando.setInt(3, mq.getQtde());
                        comando.executeUpdate();
                    } else {
                        //conferir esse pedaço
                        PreparedStatement comando = bd.getConexao().prepareStatement("update materialporquarto set idmaterial=?, qtde = ? where idquarto = ?");
                        comando.setInt(1, mq.getMaterial().getIdMaterial());
                        comando.setInt(2, mq.getQtde());
                        comando.setInt(3, obj.getIdQuarto());
                        comando.executeUpdate();
                    }
                } else {
                    PreparedStatement comando = bd.getConexao().prepareStatement("delete from materialporquarto where idmaterial = ?");
                    comando.setInt(1, obj.getIdQuarto());
                    comando.executeUpdate();
                }
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Quarto Abrir(int codigo) {
        try {
            Quarto quarto = new Quarto(0,0,false);

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from quartos where idquarto = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();

            quarto.setIdQuarto(resultado.getInt("codigo"));
            quarto.setNumero(resultado.getInt("numero"));
            quarto.setCodpredio(resultado.getInt("idpredio"));
            quarto.setBanheiro(resultado.getBoolean("banheiro"));
            
            carregaItens(codigo, quarto);

            return quarto;

        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Quarto obj) {
        try {
            PreparedStatement comando2 = bd.getConexao().prepareStatement("delete from materialporquarto where idquarto = ?");
            comando2.setInt(1, obj.getIdQuarto());
            comando2.executeUpdate();
            
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from quartos where idquarto = ?");
            comando.setInt(1, obj.getIdQuarto());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Quarto> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from quartos ");
            ResultSet resultado = comando.executeQuery();
            
            List<Quarto> quartos = new LinkedList<>();
            while (resultado.next()) {
                
                Quarto tmp = new Quarto(0,0,false);
                
                tmp.setIdQuarto(resultado.getInt("idquarto"));
                tmp.setNumero(resultado.getInt("numero"));
                tmp.setCodpredio(resultado.getInt("idpredio"));
                tmp.setBanheiro(resultado.getBoolean("banheiro"));
                // Pega o objeto e coloca na lista
                
                carregaItens(tmp.getIdQuarto(), tmp);
                
                quartos.add(tmp);
            }
            return quartos;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Quarto> buscar(Quarto filtro) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from quartos where idquarto = ? or idpredio = ? or numero = ?");
            comando.setInt(1, filtro.getIdQuarto());
            comando.setInt(2, filtro.getCodpredio());
            comando.setInt(3, filtro.getNumero());
            ResultSet resultado = comando.executeQuery();
            
            List<Quarto> quartos = new LinkedList<>();
            while (resultado.next()) {
                
                Quarto tmp = new Quarto(0,0,false);
                
                tmp.setIdQuarto(resultado.getInt("idquarto"));
                tmp.setNumero(resultado.getInt("numero"));
                tmp.setBanheiro(resultado.getBoolean("banheiro"));
                tmp.setCodpredio(resultado.getInt("idpredio"));
                
                
                carregaItens(tmp.getIdQuarto(), tmp);
                
                quartos.add(tmp);
            }
            return quartos;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    private void carregaItens(int id, Quarto quarto) throws SQLException {
        PreparedStatement comando2 = bd.getConexao().prepareStatement("select * from materialporquarto where idmaterial = ?");
        comando2.setInt(1, id);
        ResultSet resultado2 = comando2.executeQuery();

        List<MaterialQuarto> materiais = new LinkedList<>();
        MaterialDAO mat = new MaterialDAO();
        while (resultado2.next()) {
            MaterialQuarto tmp = new MaterialQuarto();
            tmp.setIdMaterialQuarto(resultado2.getInt("idmaterialquarto"));
            tmp.setQtde(resultado2.getInt("qtde"));
            tmp.setMaterial(mat.Abrir(resultado2.getInt("idmaterial")));
            materiais.add(tmp);
        }

        quarto.setMats(materiais);
    }
    
    public List<Quarto> listarOrdenado() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from quartos order by banheiro desc");
            ResultSet resultado = comando.executeQuery();
            
            List<Quarto> quartos = new LinkedList<>();
            while (resultado.next()) {
                
                Quarto tmp = new Quarto(0,0,false);
                
                tmp.setIdQuarto(resultado.getInt("idquarto"));
                tmp.setNumero(resultado.getInt("numero"));
                tmp.setCodpredio(resultado.getInt("idpredio"));
                tmp.setBanheiro(resultado.getBoolean("banheiro"));
                // Pega o objeto e coloca na lista
                
                carregaItens(tmp.getIdQuarto(), tmp);
                
                quartos.add(tmp);
            }
            return quartos;
        } catch (SQLException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
