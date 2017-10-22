/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.formatting;

public class OutputFormatting {

    public void printMultiplyTable() {
        int[][] multiplyTab = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTab[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", multiplyTab[i][j]);
            }
            System.out.println();
        }
    }
}
