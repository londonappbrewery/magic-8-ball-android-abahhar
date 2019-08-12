package com.londonappbrewery.magiceightball.listener;

import android.view.View;
import android.widget.ImageView;

import com.londonappbrewery.magiceightball.interfaces.AskableActivity;

import java.util.Random;

public class AskClickListener implements View.OnClickListener {

    private AskableActivity activity;
    private ImageView ballDisplay;
    private int[] ballArray;

    private static final Random randomNumberGenerator = new Random();

    public AskClickListener(AskableActivity activity) {
        this.activity = activity;
        this.ballDisplay = this.activity.getBallDisplay();
        this.ballArray = this.activity.getBallArray();
    }

    public AskableActivity getActivity() {
        return activity;
    }

    public void setActivity(AskableActivity activity) {
        this.activity = activity;
    }

    public ImageView getBallDisplay() {
        return ballDisplay;
    }

    public void setBallDisplay(ImageView ballDisplay) {
        this.ballDisplay = ballDisplay;
    }

    public int[] getBallArray() {
        return ballArray;
    }

    public void setBallArray(int[] ballArray) {
        this.ballArray = ballArray;
    }

    @Override
    public void onClick(View view) {
        int maxIndex = this.getBallArray().length; // Get the number of ball images
        int randomIndex = randomNumberGenerator.nextInt(maxIndex); // Get random index between (0,5]

        // Display the ball image with random index "randomIndex"
        this.getBallDisplay().setImageResource(this.getBallArray()[randomIndex]);
    }
}
