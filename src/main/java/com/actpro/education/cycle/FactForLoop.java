/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.cycle;

public class FactForLoop {
    public static long countFactorialForLoop(int var) {
        int result = 1;
        for (int i = 1; i <= var; i++) {
             result *= i;
        }
        return result;
    }
}
