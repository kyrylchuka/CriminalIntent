package com.an.pl020_criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;
import android.view.WindowManager;

public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
// Скрытие заголовка окна.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
// Скрытие панели состояния и прочего оформления уровня ОС
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}