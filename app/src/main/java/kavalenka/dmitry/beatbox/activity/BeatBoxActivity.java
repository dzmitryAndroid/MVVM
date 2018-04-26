package kavalenka.dmitry.beatbox.activity;

import android.support.v4.app.Fragment;

import kavalenka.dmitry.beatbox.fragment.BeatBoxFragment;

/**
 * Created by dmitry on 4/26/18.
 */

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
