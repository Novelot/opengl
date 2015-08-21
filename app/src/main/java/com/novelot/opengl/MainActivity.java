package com.novelot.opengl;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends Activity {

    private GLSurfaceView mSurface;
    GLSurfaceView.Renderer mRenderer = new Renderer1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSurface = (GLSurfaceView) findViewById(R.id.surface);
        mSurface.setEGLContextClientVersion(2);
        mSurface.setRenderer(mRenderer);
        mSurface.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
        mSurface.requestFocus();
        mSurface.setFocusableInTouchMode(true);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mSurface.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mSurface.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        mRenderer.
    }
}
