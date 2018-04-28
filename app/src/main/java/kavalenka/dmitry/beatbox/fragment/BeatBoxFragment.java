package kavalenka.dmitry.beatbox.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import kavalenka.dmitry.beatbox.BeatBox;
import kavalenka.dmitry.beatbox.R;
import kavalenka.dmitry.beatbox.Sound;
import kavalenka.dmitry.beatbox.databinding.FragmentBeatBoxBinding;
import kavalenka.dmitry.beatbox.databinding.ListItemSoundBinding;

/**
 * Created by dmitry on 4/26/18.
 */

public class BeatBoxFragment extends Fragment {

    private BeatBox mBeatBox;

    public static BeatBoxFragment newInstance() {

//        Bundle args = new Bundle();

        BeatBoxFragment fragment = new BeatBoxFragment();
//        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBeatBox = new BeatBox(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentBeatBoxBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_beat_box, container, false);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        binding.recyclerView.setAdapter(new SoundAdapter(mBeatBox.getSounds()));
        return binding.getRoot();
    }

    /**
     * ======================================================================VIEW HOLDER======================================================================
     */

    private class SoundHolder extends RecyclerView.ViewHolder {
        private ListItemSoundBinding mBinding;

        private SoundHolder(ListItemSoundBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }

    /**
     * ======================================================================ADAPTER======================================================================
     */


    private class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {

        private List<Sound> mSounds;

        public SoundAdapter(List<Sound> sounds) {
            mSounds = sounds;
        }

        @NonNull
        @Override
        public SoundHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            ListItemSoundBinding binding = DataBindingUtil.inflate(inflater, R.layout.list_item_sound, parent, false);
            return new SoundHolder(binding);
        }

        @Override
        public void onBindViewHolder(@NonNull SoundHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return mSounds.size();
        }
    }
}
