/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo7.practica;

/**
 *
 * @author carlosrodf
 */
public class Validador {

    public Validador() {
    }

    public boolean noNulls(String... args) {
        if (args == null || args.length < 1) {
            return false;
        }
        for (String arg : args) {
            if (arg.equals("")) {
                return false;
            }
        }
        return true;
    }

    public boolean paswordsMatch(String p1, String p2) {
        return p1.equals(p2);
    }

    public boolean telefonoValido(String tel) {
        try {
            double n = Double.parseDouble(tel);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean fechaValida(String dia, String mes, String anio) {
        try {
            int d = Integer.parseInt(dia);
            int m = Integer.parseInt(mes);
            int a = Integer.parseInt(anio);

            return (d > 0 && d < 32) && (m > 0 && m < 13);

        } catch (Exception e) {
            return false;
        }
    }
}
