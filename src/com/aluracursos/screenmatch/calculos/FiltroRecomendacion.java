package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificable clasificacion) {
        if(clasificacion.getClasificable() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        } else if(clasificacion.getClasificable() >= 2) {
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Inclúyelo en tu lista para verlo después");
        }
    }
}