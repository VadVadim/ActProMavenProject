/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.main;

import com.actpro.education.collections.test.AllWorkers;
import com.actpro.education.collections.test.ArrayListTest;
import com.actpro.education.collections.test.Worker;
import com.actpro.education.cycle.FactForLoop;
import com.actpro.education.image.resizing.ImageResizing;
import com.actpro.education.multithreading.ChickenVoice;
import com.actpro.education.multithreading.EggVoice;
import com.actpro.education.recursion.Factorial;
import com.actpro.education.recursion.Fibonachi;
import com.actpro.education.recursion.StringLength;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class ResultOutput {

    private static int userNumber;
    private static EggVoice firstOpinion;
    private static ChickenVoice secondOpinion;

    protected static void printFactorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a natural number userNumber : ");
        userNumber = scan.nextInt();
        print("Factorial " + userNumber + " equals " + Factorial.countFactorial(userNumber));
    }

    protected static void printFactorialForLoop() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a natural number userNumber : ");
        userNumber = scan.nextInt();
        print("Factorial " + userNumber + " equals " + FactForLoop.countFactorialForLoop(userNumber));
    }

    protected static void printFibSeries() {
        Fibonachi fibonachi = new Fibonachi();
        for (int i = 1; i < ActproConstants.FIBONACHI_NUMBER; i++) {
            System.out.print(" "+fibonachi.receiveFibSeries(i));
        }
        System.out.println();
    }
    
    protected static void calcTextLength() {
        StringLength stringLength = new StringLength();
        print(stringLength.calculateLength(ActproConstants.TEXT_FOR_LENGTH_CALC));
    }
    
    protected static void printOpinion() {
        firstOpinion = new EggVoice();
        print("The dispute is started...");
        firstOpinion.start();

        secondOpinion = new ChickenVoice();
        secondOpinion.run();

        printVoice();
        print("The dispute is completed!");
    }

    private static void printVoice() {
        if (firstOpinion.isAlive()) {
            try {
                firstOpinion.join();
            } catch (InterruptedException e) {
            }

            print("The egg came first!");
        } else {
            print("The chicken came first!");
        }
    }
    
    protected static void changeImage() throws IOException {
        BufferedImage image = ImageIO.read(new File(ActproConstants.INPUT_FILE_PATH));
        int type = image.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : image.getType();

        BufferedImage modifiedImage = ImageResizing.resizeImage(image, type);
        ImageIO.write(modifiedImage, "jpg", new File(ActproConstants.OUTPUT_FILE_PATH));
    }
    
    protected static void printListNumbers() {
        ArrayListTest testList = new ArrayListTest();     
        for (int i = 0; i < ActproConstants.LIST_ELEMENT_QUANTITY; i++) {
            testList.addRandom();
        }
        print("Random Numbers: "+testList.toString());   
    }
    
    protected static void printWorkersList() {
        AllWorkers people = new AllWorkers();
        List<Worker> newPeople = people.changeStaff();
        print(people.toString());
        print("New Workers\n" + newPeople.toString());
    }
    
    private static void print(Object notation) {
        System.out.println(notation);
    }
}
