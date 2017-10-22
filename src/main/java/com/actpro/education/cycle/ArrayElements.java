/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.cycle;

import com.actpro.education.main.ActproConstants;
import com.actpro.education.recursion.Recursion;

public class ArrayElements {
    public void outputArrayElements() {
        Recursion recursion = new Recursion(ActproConstants.ARRAY_ELEMENT_QUANTITY);
        for (int i = 0; i < ActproConstants.ARRAY_ELEMENT_QUANTITY; i++) {
            recursion.values[i] = i;
        }
        System.out.println(recursion.printArray(ActproConstants.ARRAY_ELEMENT_QUANTITY));
    }
}
