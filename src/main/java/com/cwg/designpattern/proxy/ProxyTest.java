package com.cwg.designpattern.proxy;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 创建时间：2019-10-26 14:22
 * Provide a surrogate or placeholder for another object to control access to it.
 *
 * @author 曹文岗
 **/
public class ProxyTest {

    @Test
    public void proxy() throws MalformedURLException {
        String image = "http://image.jpg";
        URL url = new URL(image);

        HighResolutionImage highResolutionImage = new HighResolutionImage(url);

        ImageProxy imageProxy = new ImageProxy(highResolutionImage);

        imageProxy.showImage();
    }
}
