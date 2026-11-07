package edu.fatec.lp2.exercicio1.modelo;

public class MsgAudio extends Mensagem {

    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, int duracao) {
        super(destinatario, horaEnvio);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        setConteudo(conteudo);
        return this;
    }

    @Override
    public String toString() {
        return "[Audio] Para: " + getDestinatario().getNome() + " | Hora: " + getHoraEnvio()
                + " | Arquivo: " + getConteudo() + " | Duracao: " + duracao + "s";
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
