package model;

import controller.FuncionarioController;
import dao.FuncionarioDao;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import view.Funcionario;

/**
 *
 * @author User
 */

@Entity
@Table (name = "funcionario" )

public class FuncionarioModel {
    
    public FuncionarioModel(){ 
        
    }
    
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
   private int id;
   private String nomeCompleto;
   private String numeroBi;
   private String contacto;
   private String nacionalidade;
   private String localResidencia;
   private String genero;
   private String dataDeNascimento;
   private String estadoCivil;
   private String categoria;
   private String senha;
   private String email;
   private boolean existe;
   
   
   //getters e setters

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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }
    
    
    
}
