/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Iara
 */
@Entity
public class Quarto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idQuarto;
    @Column(nullable=false)
    private int numero;
    @Column(nullable=false)
    private boolean banheiro;
    @OneToMany
    private Predio predio;
    
    @OneToMany
    private List<MaterialQuarto> mats;
    
    public Quarto(int id, int num, boolean banheiro){
        this.idQuarto = id;
        this.numero = num;
        this.banheiro = banheiro;
        mats = new LinkedList<>();
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isBanheiro() {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public Predio getPredio() {
        return predio;
    }

    public void setPredio(Predio predio) {
        this.predio = predio;
    }

    public List<MaterialQuarto> getMats() {
        return mats;
    }

    public void setMats(List<MaterialQuarto> mats) {
        this.mats = mats;
    }
       
    public void add(MaterialQuarto mq){
        if(!mats.contains(mq)){
            mats.add(mq);
            
            // Tirar de estoque geral
            //valorTotal += i.getProduto().getValor() * i.getQuantidade();
        }
    }
    
    public void remove(MaterialQuarto mq){
        if(mats.contains(mq)){
            mats.remove(mq);
            
            //Tirar de estoque geral
            //valorTotal -= i.getProduto().getValor() * i.getQuantidade();
        }
    }
    
    
}
