package com.lzx.demo.multitype;

import com.lzx.demo.base.BaseMainActivity;

/**
 * BetterAdapter的运用
 * http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2016/1125/6806.html
 */
public class MultiTypeActivity extends BaseMainActivity {

    private static final Class<?>[] ACTIVITY = {BilibiliActivity.class};
    private static final String[] TITLE = {"BilibiliActivity"};

    public Class<?>[] getActivitys() {
        return ACTIVITY;
    }

    @Override
    public String[] getTitles() {
        return TITLE;
    }


}
