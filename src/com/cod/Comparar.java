package com.cod;

public class Comparar {
    String gmail = "";
    String ip = "127.0.0.2";

    Comparar() {
        gmail = "anonymous@danielcastelao.org";
    }

    Comparar(String direccion) {
        this.gmail = direccion;
    }

    public boolean validador() {
        if (gmail != "anonymous@danielcastelao.org") {

            return true;
        } else {
            return false;
        }
    }
}