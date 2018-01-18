
package com.qualitas.modelo.entities;


public class Computadora {
    
    private String marca;
    private int ram;
    private int disco;

    public Computadora(String marca, int ram, int disco) {
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
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
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the disco
     */
    public int getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(int disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", ram=" + ram + ", disco=" + disco + '}';
    }
    
    
    
}
