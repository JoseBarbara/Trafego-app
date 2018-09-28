package com.rodrigoneves.trafegometro;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.rodrigoneves.trafegometro.data.InsertData;
import com.rodrigoneves.trafegometro.data.TrafegoDbHelper;

public class SplashScreenActivity extends AppCompatActivity {

    private TrafegoDbHelper mDbHelper;
    Context context;

    private static final int AUTO_HIDE_DELAY_MILLIS = 500;

    private static final int UI_ANIMATION_DELAY = 0;
    private final Handler mHideHandler = new Handler();
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);

        context = this;

        mHideHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mDbHelper = new TrafegoDbHelper(context);
                SQLiteDatabase db = mDbHelper.getReadableDatabase();
                long numOfEntries = DatabaseUtils.queryNumEntries(db, "frotas");
                if (numOfEntries == 0) {
                    InsertData data = new InsertData(context);
                    data.insertDataBaseInfo();
                }
                showMainActivity();
            }
        }, AUTO_HIDE_DELAY_MILLIS);
    }

    private void showMainActivity() {
        startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
        finish();
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        delayedHide();
    }


    private void toggle() {
        if (mVisible) {
            hide();
        } else {
            show();
        }
    }

    private void hide() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);
        mVisible = false;

        mHideHandler.removeCallbacks(mShowPart2Runnable);
    }

    @SuppressLint("InlinedApi")
    private void show() {
        mVisible = true;

        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }

    private void delayedHide() {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, 100);
    }
}
