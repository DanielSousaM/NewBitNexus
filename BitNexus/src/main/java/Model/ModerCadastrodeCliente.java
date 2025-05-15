/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class ModerCadastrodeCliente {
    
    private String nomeDoCliente;
    private String seleciaServico;
    private String nomeMaquina;
    private String pagamemtoDoServico;
    private String formaDePagar;
    private String ligarMarquinar;

    public ModerCadastrodeCliente(String nomeDoCliente, String seleciaServico, String nomeMaquina, String pagamemtoDoServico, String formaDePagar) {
        this.nomeDoCliente = nomeDoCliente;
        this.seleciaServico = seleciaServico;
        this.nomeMaquina = nomeMaquina;
        this.pagamemtoDoServico = pagamemtoDoServico;
        this.formaDePagar = formaDePagar;
    }
     
     // metodos getter e setter

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }
    // metodo com retorno do tipo String
    public String getSeleciaServico() {
        return seleciaServico;
    }
    // metodo com parametro e sem retorno
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
