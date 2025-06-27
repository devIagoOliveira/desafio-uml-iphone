import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone();

        //Reprodutor Musical
        System.out.println("\n===Reprodutor Musical Iphone===");
        iphone.selecionarMusica("Gostava Tanto de Você - Tim Maia");
        iphone.tocar();
        iphone.pausa();

        //Navegador de Internet
        System.out.println("\n===Navegador de Internet Iphone===");
        iphone.exibirPagina("www.google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        //Telefonia
        System.out.println("\n===Telefonia Iphone===");
        iphone.ligar("(11)99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        sc.close();
    }
}
