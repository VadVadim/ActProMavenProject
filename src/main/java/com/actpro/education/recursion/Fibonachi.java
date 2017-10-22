/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.recursion;

public class Fibonachi {
    public long receiveFibSeries(int number) {
        if (number == 0) {
            return 0;
        } if (number == 1 || number == 2) {
            return 1;
        } else {
            return receiveFibSeries(number - 1) + receiveFibSeries(number - 2);
        }
    }
}
