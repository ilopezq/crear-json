/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.qualitas.modelo.entities.Computadora;


public class Lanzador {
    public static void main(String[] args){
            Computadora instancia=
                new Computadora("LENOVO",4,600);      
            
            Gson gson = new GsonBuilder().create();
            System.out.println(gson.toJson(instancia));
            
            System.out.println(instancia);
   
    }
     
}
