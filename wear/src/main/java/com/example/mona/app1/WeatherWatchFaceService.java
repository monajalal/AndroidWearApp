package com.example.mona.app1;

import android.support.wearable.watchface.CanvasWatchFaceService;
import android.view.SurfaceHolder;
import android.graphics.Paint;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Canvas;


/**
 * Created by mona on 6/26/15.
 */


public class WeatherWatchFaceService extends CanvasWatchFaceService {
    @Override
    public Engine onCreateEngine() {
        return new Engine();
    }

    /*
        private class Engine extends CanvasWatchFaceService.Engine {
            Paint mTextPaint;
            Float mTextXOffset;
            Float mTextYOffset;

            @Override
            public void onCreate(SurfaceHolder holder) {
                super.onCreate(holder);

                // Create the Paint for later use
                mTextPaint = new Paint();
                mTextPaint.setTextSize(40);
                mTextPaint.setColor(Color.WHITE);
                mTextPaint.setAntiAlias(true);

                // In order to make text in the center, we need adjust its position
                mTextXOffset = mTextPaint.measureText("12:00") / 2;
                mTextYOffset = (mTextPaint.ascent() + mTextPaint.descent()) / 2;
            }

            @Override
            public void onDraw(Canvas canvas, Rect bounds) {
                canvas.drawText("12:00",
                        bounds.centerX() - mTextXOffset,
                        bounds.centerY() - mTextYOffset,
                        mTextPaint);
            }
        }
    }
    */
    private class Engine extends CanvasWatchFaceService.Engine {
        Paint mTextPaint;
        Float mTextXOffset;
        Float mTextYOffset;

        @Override
        public void onCreate(SurfaceHolder holder) {
            super.onCreate(holder);

            // Create the Paint for later use
            mTextPaint = new Paint();
            mTextPaint.setTextSize(40);
            mTextPaint.setColor(Color.WHITE);
            mTextPaint.setAntiAlias(true);

            // In order to make text in the center, we need adjust its position
            mTextXOffset = mTextPaint.measureText("12:00") / 2;
            mTextYOffset = (mTextPaint.ascent() + mTextPaint.descent()) / 2;
        }

        @Override
        public void onDraw(Canvas canvas, Rect bounds) {
            canvas.drawText("12:00",
                    bounds.centerX() - mTextXOffset,
                    bounds.centerY() - mTextYOffset,
                    mTextPaint);
        }
    }
}