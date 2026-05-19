package co.edu.unbosque.DistilledRecords.model.dtos;

public class ResponseDTO {
    private String mensaje;
    private boolean success;

    public ResponseDTO(String mensaje, boolean success) {
        this.mensaje = mensaje;
        this.success = success;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}