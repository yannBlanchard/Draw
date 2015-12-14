package com.example.yablanch.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * Created by yablanch on 14/12/2015.
 */
public class DrawCanvas extends View{
    Paint p; //Style utilisé
    Path path; //Permet de dessiner le chemin
    public DrawCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}
