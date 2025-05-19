/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class CadastroDeFuncionarioModel {
   //cadeia -> string
   //interio-> int
   // real -> doublo ou float
   // logico -> boolean
   // datas -> Date
   
    private String nomecompleto;
    private String datadenacimento;
    private String cpf;
    private String fone;
    private String email;
    private String senha;
    private String opcao;
            
    public CadastroDeFuncionarioModel(String nomecompleto, String datadenacimento, String cpf, String fone, String email, String senha,String opcao) {
        this.nomecompleto = nomecompleto;
        this.datadenacimento = datadenacimento;
        this.cpf = cpf;
        this.fone = fone;
        this.email = email;
        this.senha = senha;
        this.opcao = opcao;
    }

    public CadastroDeFuncionarioModel() {
    }
    
    
    
       // metados getter e setter

       //gertter serve para visualizar os dados

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getDatadenacimento() {
        return datadenacimento;
    }

    public void setDatadenacimento(String datadenacimento) {
        this.datadenacimento = datadenacimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }
   
    
       

    
   
   
    
     
} // chve da class
