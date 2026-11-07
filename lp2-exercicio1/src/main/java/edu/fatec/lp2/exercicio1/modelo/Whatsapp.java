package edu.fatec.lp2.exercicio1.modelo;

public class Whatsapp {

    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public void listarContatos() {
        System.out.println("=== Contatos ===");
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                System.out.println(contatos[i]);
            }
        }
    }

    public void listarMensagens() {
        System.out.println("=== Mensagens ===");
        for (int i = 0; i < mensagens.length; i++) {
            if (mensagens[i] != null) {
                System.out.println(mensagens[i]);
            }
        }
    }

    public Contatinho[] getContatos() {
        return contatos;
    }

    public void setContatos(Contatinho[] contatos) {
        this.contatos = contatos;
    }

    public Mensagem[] getMensagens() {
        return mensagens;
    }

    public void setMensagens(Mensagem[] mensagens) {
        this.mensagens = mensagens;
    }
}
