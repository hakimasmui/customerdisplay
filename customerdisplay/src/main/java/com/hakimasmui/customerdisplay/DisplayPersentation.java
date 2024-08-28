package com.hakimasmui.customerdisplay;

import android.app.Presentation;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;

public class DisplayPersentation {
    DisplayManager displayManager;
    Display[] displays;
    Display display;

    public DisplayPersentation() {

    }

    public void showDisplay(int position) {
        if (displays.length <= 1 && displays.length > position)
            return;

        display = displays[position];
    }

    public boolean isDisplay() {
        return displays.length > 1;
    }

    public int countDisplay() {
        return displays.length;
    }
}
