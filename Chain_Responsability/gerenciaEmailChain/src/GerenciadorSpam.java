public class GerenciadorSpam extends Gerenciador {

    @Override
    public void verificar(Mail mail) {
        System.out.println("Email marcado como SPAM");
    }
}
