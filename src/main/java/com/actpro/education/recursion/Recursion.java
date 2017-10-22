/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.recursion;

public class Recursion {

    public int values[];
    StringBuilder sb = new StringBuilder();

    public Recursion(int i) {
        values = new int[i];
    }

    public String printArray(int i) {
        if (i == 0) {
            return "";
        } else {
            printArray(i - 1);
        }

        String output = "[" + (i - 1) + "] " + values[i - 1] + "\n";
        sb.append(output);
        return sb.toString();
    }
}
