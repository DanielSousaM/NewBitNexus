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
    
    private String nomeDoCliente;
    private String seleciaServico;
    private String nomeMaquina;
    private String pagamemtoDoServico;
    private String formaDePagar;
    private String ligarMarquinar;
   ;

    public CodigoCaixa(String nomeDoCliente, String seleciaServico, String nomeMaquina, String pagamemtoDoServico, String formaDePagar,String butãoVoltar) {
        this.nomeDoCliente = nomeDoCliente;
        this.seleciaServico = seleciaServico;
        this.nomeMaquina = nomeMaquina;
        this.pagamemtoDoServico = pagamemtoDoServico;
        this.formaDePagar = formaDePagar;
    }

    public CodigoCaixa() {
    }
     
     // metodos getter e setter
 //metodo com retorno do tipo String
    //metodo com retorno do tipo String
    // metodo com parametro e sem retorno

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getSeleciaServico() {
        return seleciaServico;
    }

    public void setSeleciaServico(String seleciaServico) {
        this.seleciaServico = seleciaServico;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public String getPagamemtoDoServico() {
        return pagamemtoDoServico;
    }

    public void setPagamemtoDoServico(String pagamemtoDoServico) {
        this.pagamemtoDoServico = pagamemtoDoServico;
    }

    public String getFormaDePagar() {
        return formaDePagar;
    }

    public void setFormaDePagar(String formaDePagar) {
        this.formaDePagar = formaDePagar;
    }

    public String getLigarMarquinar() {
        return ligarMarquinar;
    }

    public void setLigarMarquinar(String ligarMarquinar) {
        this.ligarMarquinar = ligarMarquinar;
    }

   

       
   
    
    
    
    
    
    
    
}
