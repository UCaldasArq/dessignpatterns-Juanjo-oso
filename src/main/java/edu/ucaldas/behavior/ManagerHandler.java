package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if ("avanzada".equals(request)) {
            return "Atendido por Gerente";
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return "No se puede atender la solicitud.";
        }
    }
}