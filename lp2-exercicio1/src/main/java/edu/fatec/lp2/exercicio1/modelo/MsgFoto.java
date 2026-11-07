package edu.fatec.lp2.exercicio1.modelo;

public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, int tamanho) {
        super(destinatario, horaEnvio);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        setConteudo(conteudo);
        return this;
    }

    @Override
    public String toString() {
        return "[Foto] Para: " + getDestinatario().getNome() + " | Hora: " + getHoraEnvio()
                + " | Arquivo: " + getConteudo() + " | Tamanho: " + tamanho + "KB";
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
