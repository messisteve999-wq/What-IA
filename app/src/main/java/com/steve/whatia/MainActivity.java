package com.steve.whatia;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    private final int green = Color.rgb(0, 210, 105);

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(28, 32, 28, 32);
        root.setBackgroundColor(Color.rgb(5, 25, 18));

        TextView logo = new TextView(this);
        logo.setText("◉  Steve");
        logo.setTextColor(green);
        logo.setTextSize(38);
        logo.setTypeface(Typeface.DEFAULT_BOLD);
        logo.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("What-IA");
        title.setTextColor(Color.WHITE);
        title.setTextSize(34);
        title.setTypeface(Typeface.DEFAULT_BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Ton assistant intelligent pour WhatsApp");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 12, 0, 28);

        Button access = new Button(this);
        access.setText("Configurer les réponses automatiques");
        access.setOnClickListener(v -> android.widget.Toast.makeText(
            this,
            "Prochaine étape : configurer l'accès aux notifications WhatsApp.",
            android.widget.Toast.LENGTH_LONG
        ).show());

        TextView status = new TextView(this);
        status.setText("État : configuration initiale");
        status.setTextColor(green);
        status.setTextSize(14);
        status.setGravity(Gravity.CENTER);
        status.setPadding(0, 24, 0, 0);

        root.addView(logo);
        root.addView(title);
        root.addView(subtitle);
        root.addView(access);
        root.addView(status);
        setContentView(root);
    }
}
