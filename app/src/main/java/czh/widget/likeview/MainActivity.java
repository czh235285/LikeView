package czh.widget.likeview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import czh.library.LikeView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LikeView lv1;
    LikeView lv2;
    LikeView lv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.lv1);
        lv2 = findViewById(R.id.lv2);
        lv3 = findViewById(R.id.lv3);
        lv1.setOnClickListener(this);
        lv2.setOnClickListener(this);
        lv3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.lv1 || v.getId() == R.id.lv2 || v.getId() == R.id.lv3) {
            if (lv1.isChecked()) {
                lv1.unLike();
                lv2.unLike();
                lv3.unLike();
            } else {
                lv1.like();
                lv2.like();
                lv3.like();
            }
        }
    }
}
