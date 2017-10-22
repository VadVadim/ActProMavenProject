/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.collections.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListTest {
    List list = new ArrayList();
    Random generator = new Random();
    
    public void addRandom() {
        list.add(generator.nextInt(100));
    }

    public String toString() {
        return list.toString();
    }
}
