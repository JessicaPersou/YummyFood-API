package Notificador;


import Model.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}