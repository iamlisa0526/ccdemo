package debug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.billy.cc.core.component.CC;

/**
 * @Description: java类作用描述
 * @Author: lisa
 * @CreateDate: 2020/4/23 09:15
 */
public class DebugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toast.makeText(this, "hello CC", Toast.LENGTH_SHORT).show();
        //需要单独安装运行，但不需要入口页面（只需要从主app中调用此组件）时，
        // 可直接finish当前activity
        finish();
        CC.obtainBuilder("HomeComponent")
                .setActionName("go2HomeActivity")
                .build()
                .call();
    }
}
