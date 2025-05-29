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
   
    private int idFUNCIONARIO;
    private String nomeFuncionario;
    private String datanascimentoFuncionario;
    private String cpfFuncionario;
    private String telefoneFuncionario;
    private String emailFuncionario;
    private String senhaFuncionario;

    public CadastroDeFuncionarioModel(int idFUNCIONARIO, String nomeFuncionario, String datanascimentoFuncionario, String cpfFuncionario, String telefoneFuncionario, String emailFuncionario, String senhaFuncionario) {
        this.idFUNCIONARIO = idFUNCIONARIO;
        this.nomeFuncionario = nomeFuncionario;
        this.datanascimentoFuncionario = datanascimentoFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }

   
            
  
    public CadastroDeFuncionarioModel() {
    }
    
    
    
       // metados getter e setter

       //gertter serve para visualizar os dados

    public int getIdFUNCIONARIO() {
        return idFUNCIONARIO;
    }

    public void setIdFUNCIONARIO(int idFUNCIONARIO) {
        this.idFUNCIONARIO = idFUNCIONARIO;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getDatanascimentoFuncionario() {
        return datanascimentoFuncionario;
    }

    public void setDatanascimentoFuncionario(String datanascimentoFuncionario) {
        this.datanascimentoFuncionario = datanascimentoFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

   

   
   
    
       

    
   
   
     
} // chve da class
