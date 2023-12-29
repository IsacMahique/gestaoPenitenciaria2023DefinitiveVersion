package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "processo")
public class ProcessoModel {
 
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
 private int id;
 private String nomeCompleto;    
 private String numeroBi;    
 private String naturalidade;    
 private String nacionalidade;
 private String localResidencia;    
 private String genero;
 private String dataDeNascimento;
 private String doenca;
 private String nomeDoenca;    
 private String cuidadosBasicos;    
 private String antecedentesCriminais ;
 private String crimesCometidos;
 private boolean existe=true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNumeroBi() {
        return numeroBi;
    }

    public void setNumeroBi(String numeroBi) {
        this.numeroBi = numeroBi;
    }


    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getLocalResidencia() {
        return localResidencia;
    }

    public void setLocalResidencia(String localResidencia) {
        this.localResidencia = localResidencia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getNomeDoenca() {
        return nomeDoenca;
    }

    public void setNomeDoenca(String nomeDoenca) {
        this.nomeDoenca = nomeDoenca;
    }

    public String getCuidadosBasicos() {
        return cuidadosBasicos;
    }

    public void setCuidadosBasicos(String cuidadosBasicos) {
        this.cuidadosBasicos = cuidadosBasicos;
    }

    public String getAntecedentesCriminais() {
        return antecedentesCriminais;
    }

    public void setAntecedentesCriminais(String antecedentesCriminais) {
        this.antecedentesCriminais = antecedentesCriminais;
    }

    public String getCrimesCometidos() {
        return crimesCometidos;
    }

    public void setCrimesCometidos(String crimesCometidos) {
        this.crimesCometidos = crimesCometidos;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

}
