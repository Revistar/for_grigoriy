package com.example.drowing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyRis extends View {

    Paint paint;

    public MyRis(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        canvas.drawCircle(getWidth()/2,getHeight()/2,250,paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(150f);
        canvas.drawText(getWidth() + " " + getHeight(), 10, 50,paint);

        canvas.drawRect(50, 1200, 800, 1500,paint);

        //координатная сетка
        paint.setStrokeWidth(3);
        for (int i=0; i < getWidth();i+=100){
            canvas.drawLine(i,0,i,getHeight(),paint);
        }

        for (int i=0; i < getHeight(); i+=100){
            canvas.drawLine(0,i,getWidth(),i,paint);
        }





    }
}
