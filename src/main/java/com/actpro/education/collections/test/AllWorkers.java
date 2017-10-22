/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.collections.test;

import com.actpro.education.main.ActproConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AllWorkers {

    Worker ceo = new Worker(ActproConstants.CEO_NAME);
    Worker developer = new Worker(ActproConstants.DEVELOPER_NAME);
    Worker qaEngineer = new Worker(ActproConstants.QA_ENGINEER_NAME);
    Worker[] workers = {ceo, developer, qaEngineer};

    public List<Worker> changeStaff() {
        List<Worker> people = new ArrayList<>();
        Collections.addAll(people, workers);
        ListIterator<Worker> iterator = people.listIterator();
        while (iterator.hasNext()) {
            Worker next = iterator.next();
            if (ActproConstants.QA_ENGINEER_NAME.equals(next.getName())) {
                dismissPerson(iterator);
                hirePerson(iterator, ActproConstants.AUTOMATION_QA_ENGINEER_NAME);
            }
        }
        return people;
    }

    private void dismissPerson(Iterator iterator) {
        iterator.remove();
    }

    private void hirePerson(ListIterator iterator, String name) {
        iterator.add(new Worker(name));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AllWorkers{");
        sb.append("ceo= ").append(ceo.getName());
        sb.append(", developer= ").append(developer.getName());
        sb.append(", qaEngineer= ").append(qaEngineer.getName());
        sb.append(", workers= ").append(Arrays.toString(workers));
        sb.append("}");
        return sb.toString();
    }
}
