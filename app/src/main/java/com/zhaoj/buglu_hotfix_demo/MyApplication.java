package com.zhaoj.buglu_hotfix_demo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class MyApplication extends TinkerApplication {
    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, BuildConfig.APPLICATION_ID + ".MyApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
