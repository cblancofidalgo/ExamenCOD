package com.cod;

/**
 * @author Cristian Blanco
 */
public class Main {
    public static void main(String[] args) {

        if (conexionA("pepe@danielcastelao.org")) {


            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
        if (conexionB()) {
            System.out.println("Listo");
        } else {
            System.out.println("Fallo");
        }
    }

    public static boolean conexionA(String usuarioCorreo) {
        Comparar enlace = new Comparar(usuarioCorreo);
        System.out.println("Conectando a " + enlace.ip + ", con el usuario " + usuarioCorreo);
        return enlace.validador();
    }

    public static boolean conexionB() {
        Comparar enlace2 = new Comparar();
        System.out.println("Conectando a " + enlace2.ip + ", con el usuario " + enlace2.gmail);
        return enlace2.validador();
    }
}
