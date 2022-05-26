package Notificador;

import Model.Client;
import org.springframework.stereotype.Component;

@Component
public class NotifyEmail {

    public void notify(Client client, String msg) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n", client.getName(), client.getEmail(), msg);
        }

}
