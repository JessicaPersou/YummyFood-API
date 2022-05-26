package Service;

import Model.Client;
import Notificador.NotifyEmail;
import org.springframework.stereotype.Component;


@Component
public class ActiveClientService {

    private NotifyEmail notify;

    public void active(Client client) {
        client.activating();

        notify.notify(client, "Seu cadastro no sistema está ativo!");
    }

}