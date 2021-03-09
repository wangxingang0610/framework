package com.study.demo03;

import sun.misc.Launcher;

import java.net.URL;

public class TestJDKClassLoader {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());//null
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader().getClass().getName());//sun.misc.Launcher$ExtClassLoader
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName());//sun.misc.Launcher$AppClassLoader

        System.out.println();

        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("the appClassLoader : " + appClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader extClassloader = appClassLoader.getParent();
        System.out.println("the extClassloader : " + extClassloader);//sun.misc.Launcher$ExtClassLoader@1540e19d
        ClassLoader bootstrapLoader = extClassloader.getParent();
        System.out.println("the bootstrapLoader : " + bootstrapLoader);//null
        System.out.println();
        System.out.println("bootstrapLoader加载以下文件:");
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        //遍历打印
        //jre目录下jar
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i]);
        }

        System.out.println();
        System.out.println("extClassloader加载以下文件:");
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println();
        System.out.println("appClassLoader加载以下文件:");
        System.out.println(System.getProperty("java.class.path"));
    }
}