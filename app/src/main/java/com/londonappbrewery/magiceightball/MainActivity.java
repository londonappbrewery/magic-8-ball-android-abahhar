package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.londonappbrewery.magiceightball.interfaces.AskableActivity;
import com.londonappbrewery.magiceightball.listener.AskClickListener;

public class MainActivity extends AppCompatActivity implements AskableActivity {

    private ImageView ballDisplay;
    private Button askButton;
    private int[] ballArray;

    public ImageView getBallDisplay() {
        return ballDisplay;
    }

    public void setBallDisplay(ImageView ballDisplay) {
        this.ballDisplay = ballDisplay;
    }

    public Button getAskButton() {
        return askButton;
    }

    public void setAskButton(Button askButton) {
        this.askButton = askButton;
    }

    public int[] getBallArray() {
        return ballArray;
    }

    public void setBallArray(int[] ballArray) {
        this.ballArray = ballArray;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize widgets
        this.setBallDisplay((ImageView) this.findViewById(R.id.image_eightBall));
        this.setAskButton((Button) this.findViewById(R.id.button_ask));

        // Initialize array of ball images
        this.setBallArray(new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        });

        // Set Click Listener by assigning an object of AskClickListener
        this.getAskButton().setOnClickListener(new AskClickListener(this));
    }
}
