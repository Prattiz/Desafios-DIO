import java.util.Scanner;

import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;



public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {


    Scanner terminal = new Scanner(System.in);

    @Override
    public void exibirPagina(String url) {

        System.out.println("Escreva uma URL");
        url = terminal.nextLine();

        System.out.println("Exibindo pagina em " + url); 
    }

    @Override
    public void adicionarNovaAba(String url) {
        
        System.out.println("Escreva uma URL");
        url = terminal.nextLine();

        System.out.println("add nova aba em " + url); 
    }

    @Override
    public void atualizarPagina() {
        
        System.out.println("Pagina atualizada"); 
    }

    @Override
    public void tocar() {
       
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado"); 
    }

    @Override
    public void selecionarMusica() {
        
        System.out.println("Musica selecionada"); 
    }

    @Override
    public void ligar(String numero) {

        System.out.println("Numero:");
        numero = terminal.nextLine();
        
        System.out.println("ligando para " + numero);
    }

    @Override
    public void atender(String numero) {

        System.out.println("Numero:");
        numero = terminal.nextLine();
        System.out.println("atender " + numero); 
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {

        
        
        destinatario = terminal.nextLine();
        System.out.println("Escreva sua mensagem");
        mensagem = terminal.nextLine();
        
        System.out.println("correio de voz ativado: Mensagem para " + destinatario + ": " + mensagem);
    }

    public static void main(String[] args) {
        // escreva o que deseja ativar aqui...
    }
}
