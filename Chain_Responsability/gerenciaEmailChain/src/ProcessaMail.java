public class ProcessaMail {
    public static void main(String[] args) {
        Mail mail1 = new Mail("email@email.com","tecnica@digitalhouse.com","Reclamacao");
        Mail mail2 = new Mail("email@email.com","tecnica@colmeia.com","gerencia");
        Mail mail3 = new Mail("email@email.com","abrobrinha@teste.com","tecnico");
        Mail mail4 = new Mail("email@email.com","comercial@colmeia.com","biriri do Evertinho");

        CheckMail processo = new CheckMail();

        processo.verificar(mail1);
        processo.verificar(mail2);
        processo.verificar(mail3);
        processo.verificar(mail4);
    }
}
