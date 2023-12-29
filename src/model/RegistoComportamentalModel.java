/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table (name = "comportamento")
public class RegistoComportamentalModel {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idOcorrencia;

    private int idProcesso;
    private String nomeProcesso;
    private String Ocorrencia;
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

    public String getOcorrencia() {
        return Ocorrencia;
    }

    public void setOcorrencia(String Ocorrencia) {
        this.Ocorrencia = Ocorrencia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    

    
}
