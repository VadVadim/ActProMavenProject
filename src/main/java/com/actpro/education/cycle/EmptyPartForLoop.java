/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.cycle;

public class EmptyPartForLoop {

    int i;
    boolean kind;
    private StringBuilder stringBuilder;

    public void printResult() {
        for (; !kind ;) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("i равно " + i + "\n");
            if (i == 10) {
                kind = true;
            }
            i++;
        }
        System.out.println(stringBuilder.toString());
    }
}
