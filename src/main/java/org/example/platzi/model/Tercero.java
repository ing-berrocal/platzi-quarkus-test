package org.example.platzi.model;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class Tercero implements Serializable{
    
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String razonSocial;

    public Tercero(String tipoDocumento, String numeroDocumento, String razonSocial) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.razonSocial = razonSocial;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getRazonSocial() {
        return razonSocial;
    }
    
    
}
