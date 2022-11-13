public class GerenciadorComercial extends Gerenciador {
    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Comercial")){
            System.out.println("Enviado ao departamento Comercial");
        }else{
            if(this.getGerenciadorSeguinte()!= null){
                this.gerenciadorSeguinte.verificar(mail);
            }
        }
    }
}
