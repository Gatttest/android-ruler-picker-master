package hari.allagisample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class testFragment extends Fragment{

    Context context;
    TextView titleView;

    public testFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_sample, container, false);
        String title = "Fragment";
        if (getArguments() != null) {
            title = getArguments().getString("title");
        }
        titleView = view.findViewById(R.id.fragmentTitle);
        titleView.setText(title);
        return view;
    }

    public static testFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString("title", title);
        testFragment fragment = new testFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
