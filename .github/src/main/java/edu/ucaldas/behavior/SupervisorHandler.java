package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if ("intermedia".equals(request)) {
            return "Atendido por Supervisor";
        } else if (next != null) {
            return next.handleRequest(request);
        } else {
            return "No se puede atender la solicitud.";
        }
    }
}