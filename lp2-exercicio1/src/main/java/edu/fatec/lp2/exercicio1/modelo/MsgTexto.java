package edu.fatec.lp2.exercicio1.modelo;

public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio) {
        super(destinatario, horaEnvio);
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        setConteudo(conteudo);
        this.numChar = conteudo.length();
        return this;
    }

    @Override
    public String toString() {
        return "[Texto] Para: " + getDestinatario().getNome() + " | Hora: " + getHoraEnvio()
                + " | Conteudo: " + getConteudo() + " | Caracteres: " + numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}
