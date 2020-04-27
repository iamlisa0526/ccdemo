package com.lisa.homemodule;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.CCUtil;
import com.billy.cc.core.component.IComponent;

/**
 * @Description: java类作用描述
 * @Author: lisa
 * @CreateDate: 2020/4/23 10:24
 */
public class HomeComponent implements IComponent {
    @Override
    public String getName() {
        return "HomeComponent";
    }

    @Override
    public boolean onCall(CC cc) {
        String actionName = cc.getActionName();
        switch (actionName) {
            case "go2HomeActivity":
                CCUtil.navigateTo(cc, HomeActivity.class);
                CC.sendCCResult(cc.getCallId(), CCResult.success());
                break;
            default:
                CC.sendCCResult(cc.getCallId(), CCResult.errorUnsupportedActionName());
        }
        return false;
    }
}
