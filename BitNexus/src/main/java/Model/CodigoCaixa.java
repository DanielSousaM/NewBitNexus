/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class CodigoCaixa {
    
    private int idCAIXA;
    private String tipoServico;
    private String valor;
    private String formadepagamento;
    private String dataUso;
    private String tempo;

    public CodigoCaixa(int idCAIXA, String tipoServico, String valor, String formadepagamento, String dataUso, String tempo) {
        this.idCAIXA = idCAIXA;
        this.tipoServico = tipoServico;
        this.valor = valor;
        this.formadepagamento = formadepagamento;
        this.dataUso = dataUso;
        this.tempo = tempo;
    }
  

    

    public CodigoCaixa() {
    }

   
     // metodos getter e setter

    public int getIdCAIXA() {
        return idCAIXA;
    }

    public void setIdCAIXA(int idCAIXA) {
        this.idCAIXA = idCAIXA;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }

    public String getDataUso() {
        return dataUso;
    }

    public void setDataUso(String dataUso) {
        this.dataUso = dataUso;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    
    
}
