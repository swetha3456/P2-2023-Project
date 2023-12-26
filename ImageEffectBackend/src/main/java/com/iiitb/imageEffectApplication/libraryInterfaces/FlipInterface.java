package com.iiitb.imageEffectApplication.libraryInterfaces;




public class FlipInterface {
    static {
        String libraryPath = "FlipLib.so";
        LoadNativeLibrary.loadNativeLibrary(libraryPath);
    }
    public static native Pixel[][] applyFlip(Pixel[][] image, int horizontalFlipValue, int verticalFlipValue);
}
