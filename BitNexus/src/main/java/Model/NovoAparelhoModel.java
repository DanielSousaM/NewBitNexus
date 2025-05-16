/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class NovoAparelhoModel {
    private String nomeaparelho, tipoaparelho;

    public NovoAparelhoModel(String nomeaparelho, String tipoaparelho) {
        this.nomeaparelho = nomeaparelho;
        this.tipoaparelho = tipoaparelho;
    }

    public NovoAparelhoModel() {
        
    }
    
    public String getNomeaparelho() {
        return nomeaparelho;
    }

    public void setNomeaparelho(String nomeaparelho) {
        this.nomeaparelho = nomeaparelho;
    }

    public String getTipoaparelho() {
        return tipoaparelho;
    }

    public void setTipoaparelho(String tipoaparelho) {
        this.tipoaparelho = tipoaparelho;
    }

    public void setNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
