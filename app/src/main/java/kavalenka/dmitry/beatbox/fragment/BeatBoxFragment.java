package kavalenka.dmitry.beatbox.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by dmitry on 4/26/18.
 */

public class BeatBoxFragment extends Fragment {

    public static BeatBoxFragment newInstance() {

        Bundle args = new Bundle();

        BeatBoxFragment fragment = new BeatBoxFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
