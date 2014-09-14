package com.situationalinertia.showaduck;

/**
 * Created by jgilman0 on 7/2/2014.
 */

import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.widget.Button;
        import android.view.View;
        import android.view.View.OnClickListener;

public class showduck extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showaduck);

        addListenerOnButton();

    }

    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.duckbutton);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://commons.wikimedia.org/wiki/File:Bucephala-albeola-010.jpg"));
                startActivity(browserIntent);

            }

        });

    }

}