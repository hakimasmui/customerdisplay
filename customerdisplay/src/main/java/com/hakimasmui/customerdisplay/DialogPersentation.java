package com.hakimasmui.customerdisplay;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

public class DialogPersentation extends Presentation {
    public DialogPersentation(Context outerContext, Display display) {
        super(outerContext, display);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
