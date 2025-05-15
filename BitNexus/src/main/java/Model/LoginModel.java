/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class LoginModel {
    // cadeia > String
    // inteiro > int
    // real > float ou double 
    // logico > boolean
    // datas > Date ou String
    
    String senha;
    String cpf;
    String login;

    public LoginModel(String cpf, String senha, String login) {
        this.cpf = cpf;
        this.senha = senha;
        this.login = login;
        
    }
    
 
    
}
