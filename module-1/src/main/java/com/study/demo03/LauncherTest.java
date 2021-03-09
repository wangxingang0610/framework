package com.study.demo03;

import sun.misc.Launcher;

/**
 * Launcher 非单例
 *
 */
public class LauncherTest {
    public static void main(String[] args) {
        Launcher launcher1 = new Launcher();
        Launcher launcher2 = new Launcher();
        System.out.println(launcher1 == launcher2);
    }
}
