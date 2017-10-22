/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.main;

import com.actpro.education.cycle.ArrayElements;
import com.actpro.education.cycle.EmptyPartForLoop;
import com.actpro.education.cycle.ForLoop;
import com.actpro.education.formatting.OutputFormatting;
import com.actpro.education.text.TextModifyAction;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application extends ResultOutput {

    public static void executeExamples() {
        printMultiplyTable();
        executeCycle();
        executeEmptyPartCycle();
        modifyText();
        countFactorial();
        printFirstArrayElements();
        printFibonachiSeries();
        printTextLength();
        printEggOrChicken();
        try {
            resizeImage();
        } catch (IOException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, "Can't find input file!", ex);
        }
        printNumbers();
        printWorkers();
    }

    private static void printMultiplyTable() {
        print("Task for formatting");
        OutputFormatting outputFormatting = new OutputFormatting();
        outputFormatting.printMultiplyTable();
    }

    private static void executeCycle() {
        print("Task for work with cycle");
        ForLoop forLoop = new ForLoop();
        forLoop.printArray();
    }

    private static void executeEmptyPartCycle() {
        print("Task  with cycle, which have empty parts");
        EmptyPartForLoop emptyForLoop = new EmptyPartForLoop();
        emptyForLoop.printResult();
    }

    private static void modifyText() {
        print("Task about modifying of string");
        TextModifyAction textModifyAction = new TextModifyAction();
        textModifyAction.modifyText();
    }

    private static void countFactorial() {
        print("Task with counting of factorial using recursion");
        printFactorial();
        print("Task with counting of factorial for loop");
        printFactorialForLoop();
    }

    private static void printFirstArrayElements() {
        print("Task for Recursion");
        ArrayElements arrayElements = new ArrayElements();
        arrayElements.outputArrayElements();
    }

    private static void printFibonachiSeries() {
        print("Task about Fibonachi Series");
        printFibSeries();
    }

    private static void printTextLength() {
        print("Task about String Length");
        calcTextLength();
    }

    private static void printEggOrChicken() {
        print("Task about multithreading");
        printOpinion();
    }

    private static void resizeImage() throws IOException {
        changeImage();
        print("Image resizing was succesfull");
    }
    
    private static void printNumbers() {
        print("Task about ArrayList");
        printListNumbers();   
    }

    private static void printWorkers() {
        print("Task about Workers");
        printWorkersList();   
    }
    
    static void print(Object notation) {
        System.out.println("\n " + notation + "\n");
    }
}
