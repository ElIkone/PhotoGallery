package com.bignerdrach.android.photogallery;

import android.support.v4.app.Fragment;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return PhotoGalleryFragment.newInstance();
    }
}
