package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "Visitas")
public class VisitaModel {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVisita;
    
    private int idProcesso;
    private String nomeProcesso;
    private String nomeVisitantes;
    private String parentesco;
    private String data;

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public String getNomeProcesso() {
        return nomeProcesso;
    }

    public void setNomeProcesso(String nomeProcesso) {
        this.nomeProcesso = nomeProcesso;
    }

    public String getNomeVisitantes() {
        return nomeVisitantes;
    }

    public void setNomeVisitantes(String nomeVisitantes) {
        this.nomeVisitantes = nomeVisitantes;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
}
