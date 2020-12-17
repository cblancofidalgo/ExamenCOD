package com.cod;

public class Comparar {
    String gmail = "";
    String ip = "127.0.0.2";
    private static Comparar instance = null;
    
    public static Comparar gentInstance(){
        if (instance == null){
            instance = new Comparar();
        }
        gmail = "anonymous@danielcastelao.org";
        return instance;
    }

    public static Comparar getInstance(String gmail){
        if (instance == null){
            instance = new Comparar();
        }

    }

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