package com.ms.module.impl.controllswitch;

import com.ms.module.supers.inter.controll.IControllSwitchAdapter;

public class ControllSwitchImpl extends IControllSwitchAdapter {

    public ControllSwitchImpl() {
        super();
    }

    private boolean logoutFlag;

    private boolean tencentBuglyFlag = false;

    private boolean aliyunLogFlag = false;


    private boolean stackFlag;

    @Override
    public void setLogOut(boolean flag) {
        logoutFlag = flag;
    }

    @Override
    public boolean getLogOut() {
        return logoutFlag;
    }


    @Override
    public void setPrintStackTrace(boolean flag) {
        stackFlag = flag;
    }

    @Override
    public boolean getPrintStackTrace() {
        return stackFlag;
    }

    @Override
    public void setAliyunLogSend(boolean flag) {
        aliyunLogFlag = flag;
    }

    @Override
    public boolean getAliyunLogSend() {
        return aliyunLogFlag;
    }

    @Override
    public void setTencentBugly(boolean flag) {
        tencentBuglyFlag = flag;
    }

    @Override
    public boolean getTencentBugly() {
        return tencentBuglyFlag;
    }
}




