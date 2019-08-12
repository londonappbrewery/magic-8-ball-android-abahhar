package com.londonappbrewery.magiceightball.interfaces;

import android.widget.Button;
import android.widget.ImageView;

public interface AskableActivity {

    ImageView getBallDisplay();

    void setBallDisplay(ImageView ballDisplay);

    Button getAskButton();

    void setAskButton(Button askButton);

    int[] getBallArray();

    void setBallArray(int[] ballArray);

}
