/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.collections.test;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    } 
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Worker{");
        sb.append("name= ").append(getName());
        sb.append("}");
        return sb.toString();
    }
}
