
package com.qualitas.modelo.entities;


public class Ram {
    private String marca;
    private int capacidad;
    
    public Ram(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the ram to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
