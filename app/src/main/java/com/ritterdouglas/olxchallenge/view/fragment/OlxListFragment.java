package com.ritterdouglas.olxchallenge.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ritterdouglas.olxchallenge.R;
import com.ritterdouglas.olxchallenge.adapter.OlxListAdapter;
import com.ritterdouglas.olxchallenge.databinding.FragmentOlxListBinding;
import com.ritterdouglas.olxchallenge.view_model.FragmentListViewModel;

import java.util.ArrayList;
import java.util.List;

public class OlxListFragment extends Fragment {

    public static final String TAG = OlxListFragment.class.getSimpleName();
    public static final String DETAILS = "details";
    public static final String POSITION = "position";

    private FragmentListViewModel mViewModel;
    public OlxListFragment() {}

    public static Fragment newInstance(int position) {
        OlxListFragment fragment = new OlxListFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
//        args.putParcelable(DETAILS, data);
        fragment.setArguments(args);
        return fragment;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int position = getArguments().getInt(POSITION, 0);
//        DetailsLeanData data = getArguments().getParcelable(DETAILS);
//        mViewModel = new FragmentDetailViewModel(data);

    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentOlxListBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_olx_list, container, false);
//        mBinding.setViewModel(mViewModel);

        List<String> list = new ArrayList<>();

//        mBinding.recyclerView.setAdapter(new OlxListAdapter(list));

        return mBinding.getRoot();

    }

}