package com.solucao_computacional.util;

public class Validador {

    public static boolean textoVazio(String texto) {
        return texto == null || texto.trim().isEmpty();
    }

    public static boolean emailValido(String email) {
        return email != null && email.contains("@");
    }
}