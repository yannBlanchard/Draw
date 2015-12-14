package com.example.yablanch.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by yablanch on 14/12/2015.
 */
public class DrawCanvas extends View{
    private Paint paint = null; //Style utilisé
    private Path path = null; //Permet de dessiner le chemin
    String TAG_LOG;



    public DrawCanvas(Context context) {
        super(context);
        reset();
        TAG_LOG=this.getClass().getCanonicalName();
        this.setOnTouchListener(new mTouch());
    }


    public void reset(){
        paint = new Paint();
        path = new Path();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(15f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(Color.RED);
        invalidate(); // update (force a redessiner)
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        canvas.drawPath(path,paint);
    }

    private class mTouch implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            float eventX = event.getX();
            float eventY = event.getY();

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    path.moveTo(eventX, eventY);
                    break;
                case MotionEvent.ACTION_MOVE:
                    path.lineTo(eventX, eventY);
                    break;
                case MotionEvent.ACTION_UP:

                    break;
                default:
                    return false;
            }
            invalidate();
            return true;
        }
    }
}
