package br.uniamerica.biblioteca.config;

import java.io.Serializable;

public class JwtResponse implements Serializable {

    private static final long serialVersionUID = -1588003174L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}
