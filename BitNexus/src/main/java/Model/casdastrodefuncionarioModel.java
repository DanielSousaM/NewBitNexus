/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class casdastrodefuncionarioModel {
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

    public casdastrodefuncionarioModel(String nomecompleto, String datadenacimento, String cpf, String fone, String email, String senha) {
        this.nomecompleto = nomecompleto;
        this.datadenacimento = datadenacimento;
        this.cpf = cpf;
        this.fone = fone;
        this.email = email;
        this.senha = senha;
    }
    
       // metados getter e setter

       //gertter serve para visualizar os dados
    public String getNomecompleto() {
        return nomecompleto;
    }
       // setter serve para guarda dados
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
       

    
   
   
    
     
} // chve da class
