public class GerenciadorTecnico extends Gerenciador {

    @Override
    public void verificar(Mail mail) {
        if(mail.getDestino().equalsIgnoreCase("tecnica@colmeia.com") || mail.getAssunto().equalsIgnoreCase("Tecnico")){
            System.out.println("Enviado ao departamento Tecnico");
        }else{
            if(this.getGerenciadorSeguinte()!= null){
                this.gerenciadorSeguinte.verificar(mail);
            }
        }
    }
}
