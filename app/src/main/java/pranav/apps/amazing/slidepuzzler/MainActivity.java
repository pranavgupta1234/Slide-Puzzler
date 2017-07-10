package pranav.apps.amazing.slidepuzzler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.opengl.CCGLSurfaceView;

public class MainActivity extends AppCompatActivity {

    protected CCGLSurfaceView _glSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
