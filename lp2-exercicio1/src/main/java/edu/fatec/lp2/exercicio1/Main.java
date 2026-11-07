package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.modelo.Contatinho;
import edu.fatec.lp2.exercicio1.modelo.Mensagem;
import edu.fatec.lp2.exercicio1.modelo.MsgAudio;
import edu.fatec.lp2.exercicio1.modelo.MsgFoto;
import edu.fatec.lp2.exercicio1.modelo.MsgTexto;
import edu.fatec.lp2.exercicio1.modelo.Whatsapp;

public class Main {

    public static void main(String[] args) {
        Contatinho joao = new Contatinho("Joao", "(12) 99999-1111");
        Contatinho maria = new Contatinho("Maria", "(12) 98888-2222");
        Contatinho pedro = new Contatinho("Pedro", "(12) 97777-3333");

        Contatinho[] contatos = new Contatinho[3];
        contatos[0] = joao;
        contatos[1] = maria;
        contatos[2] = pedro;

        Mensagem[] mensagens = new Mensagem[3];
        mensagens[0] = new MsgTexto(joao, "08:30").sendMessage("Bom dia, tudo bem?");
        mensagens[1] = new MsgAudio(maria, "09:15", 45).sendMessage("audio_reuniao.mp3");
        mensagens[2] = new MsgFoto(pedro, "10:00", 2048).sendMessage("foto_praia.jpg");

        Whatsapp whatsapp = new Whatsapp(contatos, mensagens);
        whatsapp.listarContatos();
        whatsapp.listarMensagens();
    }
}
