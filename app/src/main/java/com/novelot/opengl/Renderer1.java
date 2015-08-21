package com.novelot.opengl;

import android.opengl.GLSurfaceView;
import android.util.Log;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by V on 2015/8/21.
 */
public class Renderer1 implements GLSurfaceView.Renderer {

    public static final String TAG = "opengl";

    @Override
    public void onDrawFrame(GL10 gl) {
        Log.i(TAG, "onDrawFrame");
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        Log.i(TAG, "onSurfaceCreated");
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        Log.i(TAG, "onSurfaceChanged");
    }
}
