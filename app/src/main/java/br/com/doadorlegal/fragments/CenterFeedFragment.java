package br.com.doadorlegal.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.doadorlegal.R;
import br.com.doadorlegal.adapters.CenterFeedAdapter;
import br.com.doadorlegal.adapters.PersonFeedAdapter;
import br.com.doadorlegal.fragments.dummy.DummyContent;

public class CenterFeedFragment extends Fragment {


    public CenterFeedFragment() {
    }

    @SuppressWarnings("unused")
    public static CenterFeedFragment newInstance() {
        return new CenterFeedFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person_feed, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new CenterFeedAdapter(DummyContent.ITEMS, getActivity()));
        }
        return view;
    }
}
