package edu.fatec.lp2.exercicio1.modelo;

public abstract class Mensagem {

    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
    }

    public abstract Mensagem sendMessage(String conteudo);

    public abstract String toString();

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
