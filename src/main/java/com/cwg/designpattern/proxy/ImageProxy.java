package com.cwg.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 创建时间：2019-10-26 14:19
 *
 * @author 曹文岗
 **/
@Slf4j
public class ImageProxy implements Image {

    private HighResolutionImage highResolutionImage;

    public ImageProxy(HighResolutionImage highResolutionImage){
        this.highResolutionImage = highResolutionImage;
    }

    @Override
    public void showImage() {
        while (!highResolutionImage.isLoad()){
            log.info("Temp image: {}, {}", highResolutionImage.getWidth(), highResolutionImage.getHeight());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        highResolutionImage.showImage();
    }
}
