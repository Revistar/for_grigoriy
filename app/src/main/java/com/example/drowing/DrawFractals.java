package com.example.drowing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.view.View;

public class DrawFractals extends View {

    Paint paint;
    int w, h;

    public DrawFractals(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        canvas.drawColor(Color.BLACK);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        drawCircles(canvas, w/2, h/2, 600);
        paint.setColor(Color.RED);
        drawCircles(canvas, w/2,h/2,300);
    }

    public void drawRectanles (Canvas canvas, int x, int y, int r){
    }

    public void drawCircles(Canvas canvas, int x, int y, int r){
        canvas.drawCircle(x,y,r,paint);
        if(r>10){
            drawCircles(canvas, x, y-r, r/2);
            drawCircles(canvas,x+r,y,r/2);
            drawCircles(canvas, x, y+r, r/2);
            drawCircles(canvas, x-r,y,r/2);
        }
    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.w = w;
        this.h = h;

    }
}
