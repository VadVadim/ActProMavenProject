/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.recursion;

import org.apache.commons.lang.StringUtils;

public class StringLength {

    public int calculateLength(String str) {
        int length = str.length();
        if (StringUtils.isBlank(str)) {
            return 0;
        }
        return calculateLength(str.substring(0, length - 1)) + 1;
    }
}
