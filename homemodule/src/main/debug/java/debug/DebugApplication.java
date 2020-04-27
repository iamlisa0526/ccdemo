package debug;

import android.app.Application;

import com.billy.cc.core.component.CC;
import com.lisa.homemodule.BuildConfig;

/**
 * @Description: java类作用描述
 * @Author: lisa
 * @CreateDate: 2020/4/23 09:09
 */
public class DebugApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CC.enableDebug(BuildConfig.DEBUG);
        CC.enableVerboseLog(BuildConfig.DEBUG);
        CC.enableRemoteCC(BuildConfig.DEBUG);
    }
}
