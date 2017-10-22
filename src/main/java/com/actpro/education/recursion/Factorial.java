/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.recursion;

public class Factorial {
    public static long countFactorial(int var) {
        if (var == 1) {
            return 1;
        } else {
            return var * countFactorial(var - 1);
        }
    }
}
