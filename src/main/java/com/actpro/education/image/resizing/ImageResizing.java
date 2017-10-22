/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.image.resizing;

import com.actpro.education.main.ActproConstants;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageResizing {

    public static BufferedImage resizeImage(BufferedImage originalImage, int type) {
        BufferedImage modifiedImage = new BufferedImage(ActproConstants.IMG_WIDTH, ActproConstants.IMG_HEIGHT, type);
        Graphics2D graphics = modifiedImage.createGraphics();
        graphics.drawImage(originalImage, 0, 0, ActproConstants.IMG_WIDTH, ActproConstants.IMG_HEIGHT, null);
        graphics.dispose();
        return modifiedImage;
    }
}
