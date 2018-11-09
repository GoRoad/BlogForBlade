package com.groad.blade.helloworld;

import com.blade.Blade;

/**
 * HelloWorld
 */
public class HelloWorld {

    public static void main(String[] args) {
        Blade.of().get("/", crx -> crx.text("hello Blade")).start();
    }
}